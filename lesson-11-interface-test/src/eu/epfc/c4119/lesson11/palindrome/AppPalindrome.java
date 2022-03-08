package eu.epfc.c4119.lesson11.palindrome;

import java.util.Scanner;

public class AppPalindrome {

    public static void main(String[] args) {
        System.out.println("Ecrivez un mot");
        Scanner keyboard = new Scanner(System.in);
        do {
            String word = keyboard.nextLine();
            if (word.equals("Q")) break;
            PalindromeReverse palindrome = new PalindromeReverse(word);

            if (palindrome.isValid()) {
                System.out.println(word + " est un palindrome");
            } else {
                System.out.println(word + " n'est pas un palindrome");
            }

        } while (true);
        System.out.println("Merci d'avoir jouer au palindrome");
    }
}
