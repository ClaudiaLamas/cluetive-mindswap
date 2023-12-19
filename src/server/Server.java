package server;



import server.commands.Command;
import server.exceptions.NoMessageException;
import server.exceptions.ServerNotLaunch;
import server.commands.CommandMessages;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    private ExecutorService gameService;
    private static final int PORT = 8080;


    public Server() {

    }

    // =====================================================================================
    // ============================ SERVER LAUNCHER ========================================
    // =====================================================================================
    public static void main(String[] args) {
        Server server = new Server();

        try {
            server.start(PORT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(int port) throws IOException {

        ServerSocket serverSocket = new ServerSocket(port);
        gameService = Executors.newCachedThreadPool();

        System.out.println(CommandMessages.SERVER_STARTED + port);

        Game game = new Game(this);
        gameService.execute(game);
        System.out.println("GAME CREATED!");

        while (serverSocket.isBound()) {

            if (!game.isGameAcceptingPlayers()) {
                return;
            }

            if (game.isGameAcceptingPlayers()) {
                game.acceptPlayer(serverSocket);
                System.out.println(Messages.PLAYER_JOINED);
            }
                try { //Give some time to start another game or an error will occur
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }



    }
