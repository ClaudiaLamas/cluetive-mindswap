package server.commands;

import server.Game;


public class ListHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        playerClientHandler.send(game.listPlayers());
    }
}

