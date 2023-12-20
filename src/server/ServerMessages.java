package server;

public class ServerMessages {

    public static final String SERVER_STARTED = "Server started on port: %s\n";
    public static final String GAME_CREATED = "GAME CREATED!\n";


    public static final String CLIENT_ENTERED_GAME = " entered the game";

    public static final String PLAYER_JOINED = "Player joined the game";
    public static final String DEFAULT_NAME = "PLAYER-";
    public static final String COMMANDS_LIST = """
            List of available commands:
            /list -> gets you the list of connected clients
            /shout <message> -> lets you shout a message to all connected clients
            /whisper <username> <message> -> lets you whisper a message to a single connected client
            /group <username;username;username> -> lets you whisper a message to a group connected clients
            /name <new name> -> lets you change your name
            /quit -> exits the server""";
    public static final String CLIENT_ERROR = "Something went wrong with this client's connection. Error: ";
}
