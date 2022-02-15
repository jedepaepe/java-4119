package l09;

import java.util.Scanner;

public class EchoVertical {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Tapez un texte : ");
        String text = keyboard.nextLine();
        for (int i = 0; i < text.length(); ++i) {
            System.out.println(text.charAt(i));
        }
    }
}
