package server.commands;

import Utils.CommandMessages;
import server.Server;

import java.util.Optional;

public class Bet implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        String message = clientConnectionHandler.getMessage();


        if (message.split(" ").length < 2) {
            clientConnectionHandler.send(CommandMessages.BET);
            return;
        }

        String[] messages = message.split(" ", 2); //    /bet mindera;diogoVelho;git

        String command = messages[0];
        String[] bet = messages[1].split(";", 3);
        String messageToSend = messages[1];

        server.broadcast(clientConnectionHandler, messageToSend);
    }



}
