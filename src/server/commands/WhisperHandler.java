package server.commands;

import Utils.CommandMessages;
//import server.Game;

import java.util.Optional;

/*public class WhisperHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        String message = playerClientHandler.getMessage();

        if (message.split(" ").length < 2) {
            playerClientHandler.send(CommandMessages.WHISPER_INSTRUCTIONS);
            return;
        }

        Optional<Game.PlayerClientHandler> receiverClient = game.getPlayerByName(message.split(" ")[1]);

        if (receiverClient.isEmpty()) {
            playerClientHandler.send(CommandMessages.NO_SUCH_CLIENT);
            return;
        }

        String messageToSend = message.substring(message.indexOf(" ") + 1).substring(message.indexOf(" ") + 1);
        receiverClient.get().send(playerClientHandler.getName() + CommandMessages.WHISPER + ": " + messageToSend);
    }
}*/
