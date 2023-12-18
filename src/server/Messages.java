package server;

public class Messages {

    public static final String CLIENT_ENTERED_GAME = " entered the game";
    public static final String WELCOME = "Wellcome";
    public static final String COMMANDS_LIST = """
            List of available commands:
            /list -> gets you the list of connected clients
            /shout <message> -> lets you shout a message to all connected clients
            /whisper <username> <message> -> lets you whisper a message to a single connected client
            /group <username;username;username> -> lets you whisper a message to a group connected clients
            /name <new name> -> lets you change your name
            /quit -> exits the server""";

}
