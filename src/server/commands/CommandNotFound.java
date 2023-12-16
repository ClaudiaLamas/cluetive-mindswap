package server.commands;

import Utils.CommandMessages;
import server.Server;

public class CommandNotFound implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        clientConnectionHandler.send(CommandMessages.NO_SUCH_COMMAND);
    }
}
