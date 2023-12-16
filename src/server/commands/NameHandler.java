package server.commands;

import Utils.CommandMessages;
import server.Server;

public class NameHandler implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        String message = clientConnectionHandler.getMessage();
        String name = message.substring(6);
        String oldName = clientConnectionHandler.getName();
        server.getClientByName(name).ifPresentOrElse(
                client -> clientConnectionHandler.send(CommandMessages.CLIENT_ALREADY_EXISTS),
                () -> {
                    clientConnectionHandler.setName(name);
                    clientConnectionHandler.send(CommandMessages.SELF_NAME_CHANGED.formatted(name));
                    server.broadcast(name, CommandMessages.NAME_CHANGED.formatted(oldName, name));
                }
        );
    }
}
