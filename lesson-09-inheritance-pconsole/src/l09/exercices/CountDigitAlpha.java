package l09.exercices;

import l09.pconsole.PConsole;

public class CountDigitAlpha extends PConsole {

    @Override
    public void onInitialize() {
        showMenu();
    }

    @Override
    public boolean onNewLine(String line) {
        if (line.equals("Q")) return false;
        handleLine(line);
        showMenu();
        return true;
    }

    @Override
    public void onTerminating() {
        println("bye, see you soon");
    }

    /**
     * affiche le menu
     */
    private void showMenu() {
        println("Tapez une phrase ou Q pour quitter");
    }

    /**
     * calcule cifffres, caractères alphabétiques et autres et affiche le résultat
     * @param text est la texte à analyser
     */
    private void handleLine(String text) {
        int numberOfDigits = countDigits(text);
        int numberOfAlphabetic = countAlphabetic(text);
        println("Nombre de chiffres : " + numberOfDigits);
        println("Nombre de caractères alphabétique : " + numberOfAlphabetic);
        println("Nombre d'autres caractères : " + (text.length() - numberOfDigits - numberOfAlphabetic));
        println("");
    }

    /**
     * compte le nombre de chiffres
     * @param text est la texte à analyser
     * @return le nombre de chiffres
     */
    private int countDigits(String text) {
        return countCharInSegment(text, '0', '9');
    }

    /**
     * compte le nombre de caractères alphabétiques
     * @param text est le texte à analyser
     * @return nombre de caractères alphabétiques
     */
    private int countAlphabetic(String text) {
        return countCharInSegment(text, 'a', 'z') + countCharInSegment(text, 'A', 'Z');
    }

    /**
     * compte le nombre de caractères compris entre min et max (compris)
     * @param text est le texte à analyser
     * @param min est le caractère minimum
     * @param max est le caractère maximum
     * @return le nombre de caractères dans le segment
     */
    private int countCharInSegment(String text, char min, char max) {
        int result = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (min <= text.charAt(i) && text.charAt(i) <= max) ++result;
        }
        return result;
    }

    public static void main(String[] args) {
        new CountDigitAlpha().run();
    }
}
