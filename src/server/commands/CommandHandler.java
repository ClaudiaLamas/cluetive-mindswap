package server.commands;

import server.Server;

@FunctionalInterface
public interface CommandHandler {
    void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler);
}
