package l09.ex1;

import l09.pconsole.PConsole;

public class EchoUpperCasePConsole extends PConsole {
    @Override
    public void onInitialize() {
        printPrompt();
    }

    @Override
    public boolean onNewLine(String line) {
        println(line);
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
