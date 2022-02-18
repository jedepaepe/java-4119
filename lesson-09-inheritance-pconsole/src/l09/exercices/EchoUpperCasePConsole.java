package l09.exercices;

import l09.pconsole.PConsole;

import java.util.Locale;

public class EchoUpperCasePConsole extends PConsole {
    @Override
    public void onInitialize() {
        printPrompt();
    }

    @Override
    public boolean onNewLine(String line) {
        println(line.toUpperCase());
        if (line.equals("Q")) return false;
        printPrompt();
        return true;
    }

    private void printPrompt() {
        print("Tapez un texte ou Q pour quitter > ");
    }

    public static void main(String[] args) {
        new EchoUpperCasePConsole().run();
    }
}
