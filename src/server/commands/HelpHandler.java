package server.commands;

import server.Game;

public class HelpHandler implements CommandHandler{
    @Override
    public void execute(Game game, Game.PlayerClientHandler playerClientHandler) {
        playerClientHandler.send(CommandMessages.COMMANDS_LIST);
    }
}
