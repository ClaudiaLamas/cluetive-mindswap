package server.commands;

import Utils.CommandMessages;
import server.Server;

import java.util.Optional;

public class WhisperHandler implements CommandHandler{
    @Override
    public void execute(Server server, Server.ClientConnectionHandler clientConnectionHandler) {
        String message = clientConnectionHandler.getMessage();

        if (message.split(" ").length < 2) {
            clientConnectionHandler.send(CommandMessages.WHISPER_INSTRUCTIONS);
            return;
        }

        Optional<Server.ClientConnectionHandler> receiverClient = server.getClientByName(message.split(" ")[1]);

        if (receiverClient.isEmpty()) {
            clientConnectionHandler.send(CommandMessages.NO_SUCH_CLIENT);
            return;
        }

        String messageToSend = message.substring(message.indexOf(" ") + 1).substring(message.indexOf(" ") + 1);
        receiverClient.get().send(clientConnectionHandler.getName() + CommandMessages.WHISPER + ": " + messageToSend);
    }
}
