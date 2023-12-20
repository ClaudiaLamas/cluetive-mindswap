package cardsagain;

import cards.CardsType;

public class Card2 {
    private String name;
    private CardsType type;
    private String cardArt;
    private CardDraw cardDraw;



    public Card2(String name, CardsType type, String cardArt) {
        this.name = name;
        this.type = type;
        this.cardArt = cardArt;
    }

    public Card2(String name, CardsType type, CardDraw cardDraw) {
        this.name = name;
        this.type = type;
        this.cardDraw = cardDraw;
    }

    public CardsType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCardArt() {
        return cardArt;
    }

        public static final String ANSI_RESET = "\u001B[0m";

        public static final String ANSI_MAGENTA = "\u001B[35m";




        static String cluetive = ANSI_MAGENTA + """

                    
                  /$$$$$$  /$$       /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$ /$$     /$$ /$$$$$$$$                      
                 /$$__  $$| $$      | $$  | $$| $$_____/|__  $$__/|_  $$_/| $$    | $$| $$_____/                      
                | $$  \\__ | $$      | $$  | $$| $$         | $$     | $$  | $$    | $$| $$                    
                | $$      | $$      | $$  | $$| $$$$$      | $$     | $$  |  $$  / $$/| $$$$$  
                | $$      | $$      | $$  | $$| $$__/      | $$     | $$   \\  $$ $$/  | $$__/  
                | $$    $$| $$      | $$  | $$| $$         | $$     | $$    \\  $$$/   | $$     
                |  $$$$$$/| $$$$$$$$|  $$$$$$/| $$$$$$$$   | $$    /$$$$$$   \\  $/    | $$$$$$$$
                 \\______/ |________/ \\______/ |________/   |__/   |______/    \\_/     |________/""" + ANSI_RESET;




        public String getCluetive() {
            return cluetive;
        }



}
