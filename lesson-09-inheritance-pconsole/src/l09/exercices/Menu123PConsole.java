package l09.exercices;

import l09.pconsole.PConsole;

public class Menu123PConsole extends PConsole {

    @Override
    public void onInitialize() {
        printPrompt();
    }

    @Override
    public boolean onNewLine(String command) {
        switch (command) {
            case "1":
                println("Menu 1");
                break;
            case "2":
                println("Menu 2");
                break;
            case "3":
                println("Menu 3");
                break;
            case "Q":
                return false;
        }
        printPrompt();
        return true;
    }

    private void printPrompt() {
        print("Tapez une commande 1, 2, 3 ou Q > ");
    }

    public static void main(String[] args) {
        new Menu123PConsole().run();
    }
}
