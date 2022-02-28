package l09.exercices;

import l09.pconsole.PConsole;

public class FindNumberGame extends PConsole {
    private int target;
    private final int max = 10;

    @Override
    public void onInitialize() {
        target = (int) (Math.random() * (max + 1));
        println("Tapez un nombre entre 0 et " + max);
    }

    @Override
    public boolean onNewLine(String line) {
        int propose = convertStringToValidInteger(line);
        if (propose > max) {
            println("Vous dever taper un nombre entre 0 et " + max);
            return true;
        }
        if (propose == target) {
            println("Vous avez gagnez");
            return false;
        }
        if (propose < target) {
            println(propose + " est trop petit");
            return true;
        }
        println(propose + " est trop grand");
        return true;
    }

    @Override
    public void onTerminating() {
        println("\nMerci d'avoir jouer au jeu du nombre.\nA bientôt");
    }

    /**
     * convertit un texte en un entier valide
     * @param text est le texte à analyser
     * @return l'entier contenu dans le texte ou -1 si le texte n'est pas un index
     */
    private int convertStringToValidInteger(String text) {
        int result = convertStringToPositiveInteger(text);
        if (result < 0 || result > max) return -1;
        return result;
    }

    /**
     * convertit un texte en un entier positif
     * ou affiche une erreur si line n'est pas un nombre
     * @param text est le texte à analyser
     * @return l'entier ou -1 s'il n'y a pas d'entier
     */
    private int convertStringToPositiveInteger(String text) {
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return -1;
            }
        }
        return Integer.parseInt(text);
    }

    public static void main(String[] args) {
        new FindNumberGame().run();
    }
}
