package server.commands;

import Utils.CommandMessages;
import server.Server;

public class HelpHandler implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        clientConnectionHandler.send(CommandMessages.COMMANDS_LIST);
    }
}
