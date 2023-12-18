package server.commands;

import server.Game;


public class CommandNotFound implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        playerClientHandler.send(CommandMessages.NO_SUCH_COMMAND);
    }
}
