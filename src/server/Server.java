package server;

import Utils.CommandMessages;
import server.commands.Command;
import server.exceptions.NoMessageException;
import server.exceptions.ServerNotLaunch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {


    private ServerSocket serverSocket;
    private ExecutorService gameService;
    private final List<ClientConnectionHandler> clients;



   // private final static int ZERO = 0;


    public Server() {
        clients = new CopyOnWriteArrayList<>();
        // clients = Collections.synchronizedList(new ArrayList<>());
        //   clients = new ArrayList<>();
    }

    public static void main(String[] args) {
        Server server = new Server();
        int port = 8080;

        try {
            server.start(port);
        } catch (ServerNotLaunch e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void acceptConnection(int numberOfConnections) throws IOException {
        Socket clientSocket = serverSocket.accept();
        ClientConnectionHandler clientConnectionHandler =
                new ClientConnectionHandler(clientSocket,
                        CommandMessages.DEFAULT_NAME + numberOfConnections);
        gameService.submit(clientConnectionHandler);
        //addClient(clientConnectionHandler);
    }

    private void addClient(ClientConnectionHandler clientConnectionHandler) {
        /*synchronized (clients) {
            clients.add(clientConnectionHandler);
        }*/

        clients.add(clientConnectionHandler);
        clientConnectionHandler.send(CommandMessages.WELCOME.formatted(clientConnectionHandler.getName()));
        clientConnectionHandler.send(CommandMessages.COMMANDS_LIST);
        broadcast(clientConnectionHandler.getName(), CommandMessages.CLIENT_ENTERED_CHAT);
    }
    public void start(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        gameService = Executors.newCachedThreadPool();

        System.out.printf(CommandMessages.SERVER_STARTED, port);

        int numberOfConnections = 0;

            while (!serverSocket.isClosed()) {
                while(numberOfConnections < Game.getMaxNumOfPlayers()){
                acceptConnection(numberOfConnections);
                ++numberOfConnections;
                }
                Game game = new Game(this, numberOfConnections);
                gameService.execute(game);
            }
    }


    public void broadcast(String name, String message) {
        clients.stream()
                .filter(handler -> !handler.getName().equals(name))
                .forEach(handler -> handler.send(name + ": " + message));
    }

    public void broadcast(ClientConnectionHandler handler_, String message) {
        clients.stream()
                .filter(handler -> handler != handler_)
                .forEach(handler -> handler.send(handler.getName() + ": " + message));
    }

    public String listClients() {
        StringBuffer buffer = new StringBuffer();

        clients.forEach(client -> buffer.append(client.getName()).append("\n"));
        return buffer.toString();
    }

    public void removeClient(ClientConnectionHandler clientConnectionHandler) {
        clients.remove(clientConnectionHandler);

    }

    public Optional<ClientConnectionHandler> getClientByName(String name) {
        return clients.stream()
                .filter(clientConnectionHandler -> clientConnectionHandler.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public class ClientConnectionHandler implements Runnable {

        private String name;
        private final Socket clientSocket;
        private final BufferedWriter out;
        private String message;

        public ClientConnectionHandler(Socket clientSocket, String name) throws IOException {
            this.clientSocket = clientSocket;
            this.name = name;
            this.out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        }

        @Override
        public void run() {
            addClient(this);
            Scanner in = null;
            try {
                in = new Scanner(clientSocket.getInputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            while (in.hasNext()) {
                try {
                    // BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    message = in.nextLine();
                    if (isCommand(message)) {
                        dealWithCommand(message);
                        continue;
                    }
                    if (message.equals("")) {
                        throw new NoMessageException();
                        // continue;
                    }

                    broadcast(name, message);

                } catch (IOException e) {
                    System.err.println(CommandMessages.CLIENT_ERROR + e.getMessage());
                    removeClient(this);
                } catch (NoMessageException e) {
                    System.err.println(CommandMessages.CLIENT_ERROR + e.getMessage());
                } finally {
                    // removeClient(this);
                }
            }
        }

        private boolean isCommand(String message) {
            return message.startsWith("/");
        }

        private void dealWithCommand(String message) throws IOException {
            String description = message.split(" ")[0];
            Command command = Command.getCommandDescription(description);

            command.getHandler().execute(server.Server.this, this);
        }

        public void send(String message) {
            try {
                synchronized (out) {
                    out.write(message);
                    out.newLine();
                    out.flush();
                }

            } catch (IOException e) {
                removeClient(this);
                e.printStackTrace();
            }
        }

        public void close() {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMessage() {
            return message;
        }
    }
}

