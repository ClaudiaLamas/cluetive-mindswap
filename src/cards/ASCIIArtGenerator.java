package cards;

import java.sql.SQLOutput;

public class ASCIIArtGenerator {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";


    static String p1MindSwap = ANSI_GREEN + ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|      Mind      |" + "\n" +
            "|      Swap      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String p2Porto42 = ANSI_GREEN + ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|      42        |" + "\n" +
            "|     Porto      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String p3CodeForAll = ANSI_GREEN +  ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Code       |" + "\n" +
            "|     for        |" + "\n" +
            "|     All_       |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String p5IronHack = ANSI_GREEN + ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Iron       |" + "\n" +
            "|     Hack       |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String p6DataCamp = ANSI_GREEN + ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Data       |" + "\n" +
            "|     Camp       |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String c1Diogo = ANSI_RED + ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Diogo      |" + "\n" +
            "|     Velho      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String c2Christophe = ANSI_RED + ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|   Christophe   |" + "\n" +
            "|    Soares      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String c3Joao = ANSI_RED + ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     João       |" + "\n" +
            "|     Anes       |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String w1Git = ANSI_YELLOW + ".________________. " + "\n" +
            "|   *WEAPONS*    |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Git        |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String w2Java = ANSI_YELLOW + ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Java       |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String w3JavaScript = ANSI_YELLOW + ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     Java       |" + "\n" +
            "|    Script      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;
    static String w4Docker = ANSI_YELLOW + ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|    Docker      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String w5SpringBoot = ANSI_YELLOW + ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|    Spring      |" + "\n" +
            "|     Boot       |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    static String w6React = ANSI_YELLOW + ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|     React      |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            "|                |" + "\n" +
            ".________________. " + "\n" + ANSI_RESET;

    public static void main(String[] args) {
        System.out.println(w6React);
    }
}


