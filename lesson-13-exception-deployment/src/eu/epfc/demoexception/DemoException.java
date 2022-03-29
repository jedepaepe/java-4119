package eu.epfc.demoexception;

import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Tapez un entier ou Q ");
            String cmd = keyboard.nextLine().trim();
            if (cmd.equals("Q")) break;
            try {
                int d = Integer.parseInt(cmd);
                int result = 10 / d;
                System.out.println("10 / " + d + " = " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Vous ne pouvez pas diviser par 0");
            } catch (NumberFormatException ex) {
                System.out.println("Vous devez taper un entier ou Q");
            }
        } while(true);
        System.out.println("à bientôt");
    }
}
