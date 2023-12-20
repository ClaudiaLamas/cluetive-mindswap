package server.commands;

import server.Game;

public class BetHandler implements CommandHandler {

    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {

        String message = playerClientHandler.getMessage();

        if (message.split(" ").length < 2) {
             playerClientHandler.send(CommandMessages.BET_INSTRUCTIONS);
            return;
        }

        String[] messages = message.split(" ", 2);

        String command = messages[0];
        String[] bet = messages[1].split(";");

        String name = playerClientHandler.getName();

        playerClientHandler.send(CommandMessages.PLAYERS_BET.formatted(bet));
        game.broadcast(name, bet);

    }
}
