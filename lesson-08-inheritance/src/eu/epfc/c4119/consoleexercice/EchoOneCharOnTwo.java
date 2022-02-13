package eu.epfc.c4119.consoleexercice;

import java.util.Scanner;

public class EchoOneCharOnTwo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String line;
        do {
            System.out.print("Tapez un texte ou Q pour quitter > ");
            line = keyboard.nextLine();
            for (int i = 0; i < line.length(); i += 2) {
                System.out.print(line.charAt(i));
            }
            System.out.println();
        } while (! line.equals("Q"));
    }
}
