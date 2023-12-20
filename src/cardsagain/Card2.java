package cardsagain;

import cards.CardsType;

public class Card2 {
    private String name;
    private CardsType type;
    private String cardArt;



    public Card2(String name, CardsType type, String cardArt) {
        this.name = name;
        this.type = type;
        this.cardArt = cardArt;
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
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_MAGENTA = "\u001B[35m";

        //public List<String> deck = new ArrayList<>();
        static String p1MindSwap = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Mind    | |" + "\n" +
                "| |    Swap    | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String p2Porto42 = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |     42     | |" + "\n" +
                "| |    Porto   | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String p3CodeForAll = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Code    | |" + "\n" +
                "| |  for All_  | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String p4Switch = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |   Switch   | |" + "\n" +
                "| |    IPP     | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String p5IronHack = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Iron    | |" + "\n" +
                "| |    Hack    | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String p6DataCamp = ANSI_GREEN +
                ".________________. " + "\n" +
                "|    *PLACES*    |" + "\n" +
                "|       \uD83C\uDFE2       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Data    | |" + "\n" +
                "| |    Camp    | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String c1Diogo = ANSI_YELLOW +
                ".________________. " + "\n" +
                "|  *CRIMINALS*   |" + "\n" +
                "|       \uD83D\uDC7F       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |   Diogo    | |" + "\n" +
                "| |   Velho    | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String c2Christophe = ANSI_YELLOW +
                ".________________. " + "\n" +
                "|  *CRIMINALS*   |" + "\n" +
                "|       \uD83D\uDC7F       |" + "\n" +
                "| .____________. |" + "\n" +
                "| | Christophe | |" + "\n" +
                "| |   Soares   | |" + "\n" +
                "| '____________' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String c3Joao = ANSI_YELLOW +
                ".________________. " + "\n" +
                "|  *CRIMINALS*   |" + "\n" +
                "|       \uD83D\uDC7F       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    João    | |" + "\n" +
                "| |    Anes    | |" + "\n" +
                "| '____________' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String w1Git = ANSI_RED +
                ".________________. " + "\n" +
                "|   *WEAPONS*    |" + "\n" +
                "|     \uD83D\uDC89\uD83D\uDC80       |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Git     | |" + "\n" +
                "| |            | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String w2Java = ANSI_RED +
                ".________________. " + "\n" +
                "|    *WEAPONS*   |" + "\n" +
                "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Java    | |" + "\n" +
                "| |            | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String w3JavaScript = ANSI_RED +
                ".________________. " + "\n" +
                "|    *WEAPONS*   |" + "\n" +
                "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    Java    | |" + "\n" +
                "| |   Script   | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;
        static String w4Docker = ANSI_RED +
                ".________________. " + "\n" +
                "|    *WEAPONS*   |" + "\n" +
                "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
                "| .____________. |" + "\n" +
                "| |   Docker   | |" + "\n" +
                "| |            | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String w5SpringBoot = ANSI_RED +
                ".________________. " + "\n" +
                "|    *WEAPONS*   |" + "\n" +
                "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
                "| .____________. |" + "\n" +
                "| |   Spring   | |" + "\n" +
                "| |    Boot    | |" + "\n" +
                "| '------------' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;

        static String w6React = ANSI_RED +
                ".________________. " + "\n" +
                "|    *WEAPONS*   |" + "\n" +
                "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
                "| .____________. |" + "\n" +
                "| |    React   | |" + "\n" +
                "| |    React   | |" + "\n" +
                "| '____________' |" + "\n" +
                "|                |" + "\n" +
                "'________________' " + "\n" + ANSI_RESET;


        static String cluetive = ANSI_MAGENTA + """

                    
                  /$$$$$$  /$$       /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$ /$$     /$$ /$$$$$$$$                      
                 /$$__  $$| $$      | $$  | $$| $$_____/|__  $$__/|_  $$_/| $$    | $$| $$_____/                      
                | $$  \\__ | $$      | $$  | $$| $$         | $$     | $$  | $$    | $$| $$                    
                | $$      | $$      | $$  | $$| $$$$$      | $$     | $$  |  $$  / $$/| $$$$$  
                | $$      | $$      | $$  | $$| $$__/      | $$     | $$   \\  $$ $$/  | $$__/  
                | $$    $$| $$      | $$  | $$| $$         | $$     | $$    \\  $$$/   | $$     
                |  $$$$$$/| $$$$$$$$|  $$$$$$/| $$$$$$$$   | $$    /$$$$$$   \\  $/    | $$$$$$$$
                 \\______/ |________/ \\______/ |________/   |__/   |______/    \\_/     |________/""" + ANSI_RESET;


        public static String getP1MindSwap() {
            return p1MindSwap;
        }

        public static String getP2Porto42() {
            return p2Porto42;
        }

        public static String getP3CodeForAll() {
            return p3CodeForAll;
        }

        public static String getP4Switch() {
            return p4Switch;
        }

        public static String getP5IronHack() {
            return p5IronHack;
        }

        public static String getP6DataCamp() {
            return p6DataCamp;
        }

        public static String getC1Diogo() {
            return c1Diogo;
        }

        public static String getC2Christophe() {
            return c2Christophe;
        }

        public static String getC3Joao() {
            return c3Joao;
        }

        public static String getW1Git() {
            return w1Git;
        }

        public static String getW2Java() {
            return w2Java;
        }

        public static String getW3JavaScript() {
            return w3JavaScript;
        }

        public static String getW4Docker() {
            return w4Docker;
        }

        public static String getW5SpringBoot() {
            return w5SpringBoot;
        }

        public static String getW6React() {
            return w6React;
        }

        public String getCluetive() {
            return cluetive;
        }



}
