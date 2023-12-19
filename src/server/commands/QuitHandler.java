package server.commands;

import server.Game;

public class QuitHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        game.removePlayer(playerClientHandler);
        game.broadcast(playerClientHandler.getName(), playerClientHandler.getName() + CommandMessages.CLIENT_DISCONNECTED);
        playerClientHandler.quit();
    }
}
