package server.commands;

import Utils.CommandMessages;
import server.Server;

public class QuitHandler implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        server.removeClient(clientConnectionHandler);
        server.broadcast(clientConnectionHandler.getName(), clientConnectionHandler.getName() + CommandMessages.CLIENT_DISCONNECTED);
        clientConnectionHandler.close();
    }
}
