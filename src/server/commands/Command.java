package server.commands;

public enum Command {


    BET("/bet", new BetHandler()),
    FINAL_BET("/final_bet", new FinalBetHandler()),
    SHOW("/show", new ShowCardHandler()),
    LIST("/list", new ListHandler()),
    HELP("/help", new HelpHandler()),
    WHISPER("/whisper", new WhisperHandler()),
    // ToDo whispered message 2 letters missing
    QUIT("/quit", new QuitHandler()),
    NAME("/name", new NameHandler()),
    CHANGE_NAME("/change_name", new ChangeNameHandler()),
    NOT_FOUND("Command not found", new CommandNotFound());
    //THROW_BWT("/bet", );

    private String description;
    private CommandHandler handler;

    Command(String description, CommandHandler handler) {
        this.description = description;
        this.handler = handler;
    }

    public static Command getCommandDescription(String description) {
        for (Command command : values()) {
            if (description.equals(command.description)) {
                return command;
            }
        }
        return NOT_FOUND;
    }

    public CommandHandler getHandler() {
        return handler;
    }

    public String getDescription() {
        return description;
    }

}
