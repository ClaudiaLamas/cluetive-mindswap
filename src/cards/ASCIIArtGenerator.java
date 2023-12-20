package cards;

import java.util.ArrayList;
import java.util.List;

public class ASCIIArtGenerator {
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_RED = "\u001B[31m";

    public final String ANSI_MAGENTA = "\u001B[35m";

    //public List<String> deck = new ArrayList<>();
    String p1MindSwap = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Mind    | |" + "\n" +
            "| |    Swap    | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String p2Porto42 = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |     42     | |" + "\n" +
            "| |    Porto   | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String p3CodeForAll = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Code    | |" + "\n" +
            "| |  for All_  | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String p4Switch = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |   Switch   | |" + "\n" +
            "| |    IPP     | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String p5IronHack = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Iron    | |" + "\n" +
            "| |    Hack    | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String p6DataCamp = ANSI_GREEN +
            ".________________. " + "\n" +
            "|    *PLACES*    |" + "\n" +
            "|       \uD83C\uDFE2       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Data    | |" + "\n" +
            "| |    Camp    | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String c1Diogo = ANSI_YELLOW +
            ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|       \uD83D\uDC7F       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |   Diogo    | |" + "\n" +
            "| |   Velho    | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String c2Christophe = ANSI_YELLOW +
            ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|       \uD83D\uDC7F       |" + "\n" +
            "| .____________. |" + "\n" +
            "| | Christophe | |" + "\n" +
            "| |   Soares   | |" + "\n" +
            "| '____________' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String c3Joao = ANSI_YELLOW +
            ".________________. " + "\n" +
            "|  *CRIMINALS*   |" + "\n" +
            "|       \uD83D\uDC7F       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    João    | |" + "\n" +
            "| |    Anes    | |" + "\n" +
            "| '____________' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String w1Git = ANSI_RED +
            ".________________. " + "\n" +
            "|   *WEAPONS*    |" + "\n" +
            "|     \uD83D\uDC89\uD83D\uDC80       |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Git     | |" + "\n" +
            "| |            | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String w2Java = ANSI_RED +
            ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Java    | |" + "\n" +
            "| |            | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String w3JavaScript = ANSI_RED +
            ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    Java    | |" + "\n" +
            "| |   Script   | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;
    String w4Docker = ANSI_RED +
            ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
            "| .____________. |" + "\n" +
            "| |   Docker   | |" + "\n" +
            "| |            | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String w5SpringBoot = ANSI_RED +
            ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
            "| .____________. |" + "\n" +
            "| |   Spring   | |" + "\n" +
            "| |    Boot    | |" + "\n" +
            "| '------------' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;

    String w6React = ANSI_RED +
            ".________________. " + "\n" +
            "|    *WEAPONS*   |" + "\n" +
            "|      \uD83D\uDC89\uD83D\uDC80      |" + "\n" +
            "| .____________. |" + "\n" +
            "| |    React   | |" + "\n" +
            "| |    React   | |" + "\n" +
            "| '____________' |" + "\n" +
            "|                |" + "\n" +
            "'________________' " + "\n" + ANSI_RESET;



    String cluetive = ANSI_MAGENTA + """

                    
                  /$$$$$$  /$$       /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$ /$$     /$$ /$$$$$$$$                      
                 /$$__  $$| $$      | $$  | $$| $$_____/|__  $$__/|_  $$_/| $$    | $$| $$_____/                      
                | $$  \\__ | $$      | $$  | $$| $$         | $$     | $$  | $$    | $$| $$                    
                | $$      | $$      | $$  | $$| $$$$$      | $$     | $$  |  $$  / $$/| $$$$$  
                | $$      | $$      | $$  | $$| $$__/      | $$     | $$   \\  $$ $$/  | $$__/  
                | $$    $$| $$      | $$  | $$| $$         | $$     | $$    \\  $$$/   | $$     
                |  $$$$$$/| $$$$$$$$|  $$$$$$/| $$$$$$$$   | $$    /$$$$$$   \\  $/    | $$$$$$$$
                 \\______/ |________/ \\______/ |________/   |__/   |______/    \\_/     |________/""" + ANSI_RESET;


    /*public static void main(String[] args) {

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
        System.out.println(cluetive);

    }*/


    public String getP1MindSwap() {
        return p1MindSwap;
    }

    public String getP2Porto42() {
        return p2Porto42;
    }

    public String getP3CodeForAll() {
        return p3CodeForAll;
    }

    public String getP4Switch() {
        return p4Switch;
    }

    public String getP5IronHack() {
        return p5IronHack;
    }

    public String getP6DataCamp() {
        return p6DataCamp;
    }

    public String getC1Diogo() {
        return c1Diogo;
    }

    public String getC2Christophe() {
        return c2Christophe;
    }

    public String getC3Joao() {
        return c3Joao;
    }

    public String getW1Git() {
        return w1Git;
    }

    public String getW2Java() {
        return w2Java;
    }

    public String getW3JavaScript() {
        return w3JavaScript;
    }

    public String getW4Docker() {
        return w4Docker;
    }

    public String getW5SpringBoot() {
        return w5SpringBoot;
    }

    public String getW6React() {
        return w6React;
    }

    public String getCluetive() {
        return cluetive;
    }

}


