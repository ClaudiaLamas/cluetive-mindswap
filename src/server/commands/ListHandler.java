package server.commands;

//import server.Game;
//import server.Server;

public class ListHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        playerClientHandler.send(game.listPlayers());
    }
}

