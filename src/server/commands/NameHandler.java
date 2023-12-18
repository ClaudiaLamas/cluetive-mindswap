package server.commands;

import server.Game;

public class NameHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        String message = playerClientHandler.getMessage();
        String name = message.substring(6);
        String oldName = playerClientHandler.getName();
        game.getPlayerByName(name).ifPresentOrElse(
                client -> playerClientHandler.send(CommandMessages.CLIENT_ALREADY_EXISTS),
                () -> {
                    playerClientHandler.setName(name);
                    playerClientHandler.send(CommandMessages.SELF_NAME_CHANGED.formatted(name));
                    game.broadcast(name, CommandMessages.NAME_CHANGED.formatted(oldName, name));
                }
        );
    }
}


