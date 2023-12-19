package server.commands;

import server.Game;
import server.Server;

public class ChangeNameHandler implements CommandHandler {
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        String name = playerClientHandler.getMessage()
                .replace(Command.CHANGE_NAME.getDescription(), "").trim();
        if (game.getPlayerByName(name).isPresent()) {
            playerClientHandler.send("Duplicated name. please choose another: " + name);
            return;
        }
        playerClientHandler.setName(name);
        playerClientHandler.send("Your new name is: " + name);

    }
}
