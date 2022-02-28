package l09.exercices;

import l09.pconsole.PConsole;

public class PalindromeGame extends PConsole {

    @Override
    public void onInitialize() {
        printMenu();
    }

    @Override
    public boolean onNewLine(String line) {
        if (line.equals("Q")) return false;
        if (isPalindrome(line)) {
            println(line + " est un palindrome");
        } else {
            println(line + " n'est pas un palindrome");
        }
        return true;
    }

    @Override
    public void onTerminating() {
        println("Merci d'avoir joueur au palindrome");
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    private void printMenu() {
        println("Tapez un mot ou Q pour arrêter");
    }

    public static void main(String[] args) {
        new PalindromeGame().run();
    }
}
