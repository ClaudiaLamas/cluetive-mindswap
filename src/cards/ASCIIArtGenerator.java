package cards;

public class ASCIIArtGenerator {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";


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

    public static void main(String[] args) {

        System.out.println(p1MindSwap);
        System.out.println(p2Porto42);
        System.out.println(p3CodeForAll);
        System.out.println(p4Switch);
        System.out.println(p5IronHack);
        System.out.println(p6DataCamp);
        System.out.println(c1Diogo);
        System.out.println(c2Christophe);
        System.out.println(c3Joao);
        System.out.println(w1Git);
        System.out.println(w2Java);
        System.out.println(w3JavaScript);
        System.out.println(w4Docker);
        System.out.println(w5SpringBoot);
        System.out.println(w6React);

    }
}


