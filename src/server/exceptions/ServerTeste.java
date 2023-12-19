package server.exceptions;

/*import jdk.internal.access.JavaLangInvokeAccess;
import server.commands.CommandMessages;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTeste {
    private ServerSocket serverSocket;
    private ExecutorService service;
    private static List<PlayerClientConnectionHandler> players = null;

    private final static int ZERO = 0;

    public ServerTeste() {
        this.players = players;
    }

    public void start(int port) throws IOException {

        try {
            serverSocket = new ServerSocket(port);
            service = Executors.newCachedThreadPool();
            int numberOfConnections = ZERO;
            System.out.printf(CommandMessages.SERVER_STARTED, port);

            while (true) {
                acceptConnection(numberOfConnections);
                ++numberOfConnections;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Server could not launch due to IOException");
        }
    }

    public void acceptConnection(int numberOfConnections) throws IOException {
        Socket playerClientSocket = serverSocket.accept();
        PlayerClientConnectionHandler playerClientConnectionHandler =
                new PlayerClientConnectionHandler(playerClientSocket, "this", CommandMessages.DEFAULT_NAME + numberOfConnections);
        service.submit(playerClientConnectionHandler);
        addPlayerClient(playerClientConnectionHandler);
    }

    private static void addPlayerClient(PlayerClientConnectionHandler playerClientConnectionHandler) {
        /*synchronized (clients) {
            clients.add(clientConnectionHandler);
        }*/

     /*   players.add(playerClientConnectionHandler);
        playerClientConnectionHandler.send(CommandMessages.WELCOME.formatted(playerClientConnectionHandler.getName()));
        playerClientConnectionHandler.send(CommandMessages.COMMANDS_LIST);
        broadcast(playerClientConnectionHandler.getName(), CommandMessages.CLIENT_ENTERED_CHAT);
    }

    public void broadcast(String name, String message) {
        players.stream()
                .filter(handler -> !handler.getName().equals(name))
                .forEach(handler -> handler.send(name + ": " + message));
    }

    public void broadcast(ClientConnectionHandler handler_, String message) {
        players.stream()
                .filter(handler -> handler != handler_)
                .forEach(handler -> handler.send(handler.getName() + ": " + message));
    }


    public String listPlayerClients() {
        StringBuffer buffer = new StringBuffer();

        JavaLangInvokeAccess player = null;
        players.forEach(client -> buffer.append(player.getName("")).append("\n"));
        return buffer.toString();
    }

    public static void removeClient(PlayerClientConnectionHandler playerClientConnectionHandler) {
        players.remove(playerClientConnectionHandler);

    }

    public Optional<PlayerClientConnectionHandler> getClientByName(String name) {
        return players.stream()
                .filter(playerClientConnectionHandler -> playerClientConnectionHandler.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public class PlayerClientConnectionHandler implements Runnable {

        private String name;
        private final Socket playerClientSocket;
        private final BufferedWriter out;
        private String message;

        public PlayerClientConnectionHandler(Socket playerClientSocket, String name, String s) throws IOException {
            this.playerClientSocket = playerClientSocket;
            this.name = name;
            this.out = new BufferedWriter(new OutputStreamWriter(playerClientSocket.getOutputStream()));
        }

        @Override
        public void run() {
            addPlayerClient(this);
            Scanner in = null;
            try {
                in = new Scanner(playerClientSocket.getInputStream());
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
                        throw new NoMessageException("Empty message");
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

        private void processDetectiveCommand(PlayerClientConnectionHandler handler, String command) {
            // Implemente a lógica de detetive aqui
            // Exemplo: verificar acusações, mostrar cartas, etc.
        }

        private void dealWithCommand(String message) throws IOException {
            if (isDetectiveCommand(message)) {
                processDetectiveCommand(this, message);
            } else {
                // Lógica padrão para outros comandos
                super.dealWithCommand(message);
            }
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
                playerClientSocket.close();
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
}*/