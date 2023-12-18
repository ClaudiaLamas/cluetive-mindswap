package server.commands;

import Utils.CommandMessages;
import server.Game;
import server.Server;

public class HelpHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        playerClientHandler.send(CommandMessages.COMMANDS_LIST);
    }
}
