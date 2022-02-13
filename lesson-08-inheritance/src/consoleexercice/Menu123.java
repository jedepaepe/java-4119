package eu.epfc.c4119.consoleexercice;

import java.util.Scanner;

public class Menu123 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String command;
        do {
            System.out.print("Tapez une commande 1, 2, 3 ou Q > ");
            command = keyboard.nextLine();
            switch (command) {
                case "1":
                    System.out.println("Menu 1");
                    break;
                case "2":
                    System.out.println("Menu 2");
                    break;
                case "3":
                    System.out.println("Menu 3");
                    break;
                case "Q":
                    System.out.println("Quitte l'application");
            }
        } while(! command.equals("Q"));
    }
}
