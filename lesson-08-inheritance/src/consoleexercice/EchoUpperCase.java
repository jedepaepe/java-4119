package eu.epfc.c4119.consoleexercice;

import java.util.Scanner;

public class EchoUpperCase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line;
        do {
            System.out.print("Tapez un texte ou Q pour quitter > ");
            line = keyboard.nextLine();
            System.out.println(line.toUpperCase());
        } while (! line.equals("Q"));
    }
}
