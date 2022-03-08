package eu.epfc.c4119.lesson11.palindrome;

public class AppPalindrome2 extends PConsole {
    @Override
    public void onStart() {
        System.out.println("Ecrivez un mot ou Q pour arrêter l'application");
    }

    @Override
    public boolean onNewLine(String word) {
        if (word.equals("Q")) return false;
        IPalindrome palindrome = new PalindromeLoop(word);
        if (palindrome.isValid()) {
            println(word + " est un palindrome");
        } else {
            println(word + " n'est pas un palindrome");
        }
        return true;
    }

    @Override
    public void onStop() {
        println("Merci d'avoir jouer au palindrome");
    }

    public static void main(String[] args) {
        new AppPalindrome2().run();
    }
}
