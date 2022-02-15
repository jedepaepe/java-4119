package l09;

import java.util.Scanner;

public class UnCaractereSurDeux {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Tapez un texte : ");
        String line = keyboard.nextLine();
        for (int i = 0; i < line.length(); i = i + 2) { // 0 2 4 6 8 10 ...
            System.out.print(line.charAt(i));
        }
    }
}
