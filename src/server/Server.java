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
    private ServerSocket serverSocket;
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

        serverSocket = new ServerSocket(port);
        gameService = Executors.newCachedThreadPool();

        int numberOfConnections = 0;
        System.out.printf(CommandMessages.SERVER_STARTED, port);

        Game game = new Game(this);
        gameService.execute(game);
        System.out.println("GAME CREATED!");

        while (serverSocket.isBound()) {

            if (!game.isGameAcceptingPlayers()) {
                System.out.println("Server don't accept more connections!");
                continue;
            }

            if (game.isGameAcceptingPlayers()) {
                game.acceptPlayer(serverSocket);
                //numberOfConnections++;

                System.out.println(Messages.PLAYER_JOINED);
            }
        }

    }

}
