package l09.exercices;

import l09.pconsole.PConsole;

public class EchoOneCharOnTwoPConsole extends PConsole {

    @Override
    public void onInitialize() {
        printPrompt();
    }

    @Override
    public boolean onNewLine(String line) {
        for (int i = 0; i < line.length(); i += 2) {
            print("" + line.charAt(i));
        }
        println("");
        if (line.equals("Q")) return false;
        printPrompt();
        return true;
    }

    private void printPrompt() {
        print("Tapez un texte ou Q pour quitter > ");
    }

    public static void main(String[] args) {
        new EchoOneCharOnTwoPConsole().run();
    }
}
