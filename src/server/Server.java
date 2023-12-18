package server;

import server.commands.CommandMessages;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    private ExecutorService gameService;

  //  private ServerSocket serverSocket;
  //  private final List<ClientConnectionHandler> clients;

   // private final static int ZERO = 0;


    public Server() {
       // clients = new CopyOnWriteArrayList<>();
       // clients = Collections.synchronizedList(new ArrayList<>());
       //   clients = new ArrayList<>();
    }

    // =====================================================================================
    // ============================ SERVER LAUNCHER ========================================
    // =====================================================================================
    public static void main(String[] args) {
        Server server = new Server();
        int port = 8080;

        try {
            server.start(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(int port) throws IOException {

        ServerSocket serverSocket = new ServerSocket(port);
        gameService = Executors.newCachedThreadPool();

        System.out.printf(CommandMessages.SERVER_STARTED, port);

        while (serverSocket.isBound()) {

            Game game = createGame();

            if (!game.isGameAcceptingPlayers()) {
                return;
            }

            if (game.isGameAcceptingPlayers()) {
                game.acceptPlayer(serverSocket);
                System.out.println("New Player in Game!");
            }
                try { //Give some time to start another game or an error will occur
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        private Game createGame() {
            Game game = new Game(this);
            gameService.execute(game);
            return game;
        }

    }
