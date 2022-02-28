package l09.exercices;

import l09.pconsole.PConsole;

public class HangManGame extends PConsole {
    // idéalement il faudrait lire ces mots d'une base de donnée, d'un dictionnaire
    private final String[] words = {
            "bonjour",
            "dromadaire",
            "ville",
            "oiseau",
            "chanson"
    };
    private final String[] hangMan = {
            "\n",
            " o \n",
            " o\n | \n",
            " o\n/| \n",
            " o\n/|\\ \n",
            " o\n/|\\\n/ \n",
            " o\n/|\\\n/ \\ \n"
    };
    private char[] target;      // mot à trouver
    private boolean[] founds;   // indique si la lettre a été trouvée
    private int count = 0;      // compte le nombre de coups

    @Override
    public void onInitialize() {
        target = words[(int) (Math.random() * words.length)].toCharArray();
        founds = new boolean[target.length];
        println(buildStatusString());
    }

    @Override
    public boolean onNewLine(String line) {
        if (line.length() != 1) {
            println("Tapez un et un seul caractère");
            return true;
        }
        if (! playChar(line.charAt(0))) {
            ++count;
        }
        println(buildStatusString());
        if (isWin()) {
            println("Vous avez gagnez");
            return false;
        }
        if (! canContinue()) {
            println("Vous avez perdu");
            println("Le mot est " + buildWordString());
            return false;
        }
        return true;
    }

    /**
     * vérifie si la partie est terminée
     * @return true si la partie est terminée
     */
    private boolean canContinue() {
        return count < 7;
    }

    /**
     * vérifie si le joueur a gagné
     * @return true si le joueur a gagné
     */
    private boolean isWin() {
        for (boolean found : founds) {
            if (!found) return false;
        }
        return true;
    }

    /**
     * traite un caracètre tapé par l'utilisateur
     *      si le mot contient le caractère
     *      indiquer true dans le tableau found à la position du caractère
     * @param c le caractère
     * @return true si le caractère fait bien partie du mot
     */
    private boolean playChar(char c) {
        boolean result = false;
        for (int i = 0; i < target.length; ++i) {
            if (c == target[i]) {
                founds[i] = true;
                result = true;
            }
        }
        return result;
    }

    /**
     * calcule le texte a affiché aux utilisateurs
     * @return le texte
     */
    private String buildStatusString() {
        return buildPenduString() + "\n" + buildWordString();
    }

    /**
     * caclule le mot avec les caractères non trouvés cachés
     * @return le texte
     */
    private String buildWordString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < target.length; ++i) {
            char c = founds[i] ? target[i] : '-';
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    /**
     * calcule le pendu
     * @return le pendu
     */
    private String buildPenduString() {
        return hangMan[count];
    }

    /**
     * démarre l'application
     * @param args sont les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        new HangManGame().run();
    }
}
