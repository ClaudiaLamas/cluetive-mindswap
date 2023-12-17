package Utils;

public class CommandMessages {
    public static final String SERVER_STARTED = "Server started on port: %s";
    public static final String DEFAULT_NAME = "CLIENT-";
    public static final String CLIENT_ENTERED_CHAT = " entered the chat.";
    public static final String NO_SUCH_COMMAND = "⚠️ Invalid command!";
    public static final String COMMANDS_LIST = """
            List of available commands:
            /list -> gets you the list of connected clients
            /shout <message> -> lets you shout a message to all connected clients
            /whisper <username> <message> -> lets you whisper a message to a single connected client
            /group <username>;<username>;<username> <message> -> lets you whisper a message up to three connected clients
            /name <new name> -> lets you change your name
            /bet <cardPlace>;<cardCriminal>;<cardWeapon> -> you choose 3 cards. If next player has one card that matches with any of your bet, he will show it (only to you). If he hasn't, then the next player should take his task.
            /final_bet <cardPlace>;<cardCriminal>;<cardWeapon> -> you choose 3 cards. If all of them matches with the cards in the envelope, then you win, else you loose and quit the game (automatic operation).
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

    public static final String BET = "Bet: %s";

     public static final String FINAL_BET = "Final Bet: %s";
}
