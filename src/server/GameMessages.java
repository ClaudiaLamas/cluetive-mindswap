package server;

public class GameMessages {

    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String WELCOME = "Wellcome";
    public static final String GAME_INTRODUCTION = "A Mindera employee was taken to the Hospice with unknown symptoms.\n" +
            "Your mission in Cluetive Game, is to find WHERE it happened, WHO did it, and with WHAT!\n\n";

    public static final String CLUETIVE_LOGO = ANSI_MAGENTA + """

                    
                  /$$$$$$  /$$       /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$ /$$     /$$ /$$$$$$$$                      
                 /$$__  $$| $$      | $$  | $$| $$_____/|__  $$__/|_  $$_/| $$    | $$| $$_____/                      
                | $$  \\__ | $$      | $$  | $$| $$         | $$     | $$  | $$    | $$| $$                    
                | $$      | $$      | $$  | $$| $$$$$      | $$     | $$  |  $$  / $$/| $$$$$  
                | $$      | $$      | $$  | $$| $$__/      | $$     | $$   \\  $$ $$/  | $$__/  
                | $$    $$| $$      | $$  | $$| $$         | $$     | $$    \\  $$$/   | $$     
                |  $$$$$$/| $$$$$$$$|  $$$$$$/| $$$$$$$$   | $$    /$$$$$$   \\  $/    | $$$$$$$$
                 \\______/ |________/ \\______/ |________/   |__/   |______/    \\_/     |________/ \n\n""" + ANSI_RESET;
}
