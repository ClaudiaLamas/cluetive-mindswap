package server.commands;

import server.Server;

public class ChangeNameHandler implements CommandHandler {
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        String name = clientConnectionHandler.getMessage()
                .replace(Command.CHANGE_NAME.getDescription(), "").trim();
        if (server.getClientByName(name).isPresent()) {
            clientConnectionHandler.send("Duplicated name. please choose another: " + name);
            return;
        }
        clientConnectionHandler.setName(name);
        clientConnectionHandler.send("Your new name is: " + name);

    }
}
