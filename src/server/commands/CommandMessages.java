package server.commands;

public class CommandMessages {
    public static final String SERVER_STARTED = "Server started on port: %s\n";
    public static final String DEFAULT_NAME = "CLIENT-";
    public static final String CLIENT_ENTERED_GAME = " entered the game";
    public static final String NO_SUCH_COMMAND = "⚠️ Invalid command!";
    public static final String COMMANDS_LIST = """
            List of available commands:
            /list -> gets you the list of connected clients
            /whisper <username> <message> -> lets you whisper a message to a single connected client
            /help -> show all commands
            /name <new name> -> lets you change your name
            /quit -> exits the server""";
    public static final String CLIENT_DISCONNECTED = " left the chat.";
    public static final String WHISPER_INSTRUCTIONS = "Invalid whisper use. Correct use: '/whisper <username> <message>";
    public static final String NO_SUCH_CLIENT = "The client you want to whisper to doesn't exists.";
    public static final String WHISPER = "(whisper)";
    public static final String WELCOME = "Welcome to Cluetive!";
    public static final String CLIENT_ERROR = "Something went wrong with this client's connection. Error: ";
    public static final String CLIENT_ALREADY_EXISTS = "A client with this name already exists. Please choose another one.";

    public static final String SELF_NAME_CHANGED = "You changed your name to: %s";
    public static final String NAME_CHANGED = "%s changed name to: %s";

}
