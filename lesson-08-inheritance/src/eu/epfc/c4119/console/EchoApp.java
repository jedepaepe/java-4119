package eu.epfc.c4119.console;

import java.util.Scanner;

public class EchoApp {

    public static void main(String[] args) {
        System.out.println("Tapez du texte, je le répète");
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String line = keyboard.nextLine();
            System.out.println(line);
        }
        /*
                       buffer dans OS   \n      buffer java
                        -------------         -------------------
        clavier ------> ?KO uoy era |  --->   \n!dlrow olleh\ntop ----> nextLine
                        -------------         -------------------
         */
    }
}
