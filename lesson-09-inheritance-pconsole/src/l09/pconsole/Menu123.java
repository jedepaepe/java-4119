package l09.pconsole;

public class Menu123 extends PConsole {

    @Override
    public void onInitialize() {
        showMenu();
    }

    @Override
    public boolean onNewLine(String line) {
        switch (line) {
            case "1":
                println("Menu 1");
                break;
            case "2":
                println("Menu 2");
                break;
            case "3":
                println("Menu 3");
                break;
        }
        boolean next = ! line.equals("Q");
        if (next) showMenu();
        return next;
    }

    @Override
    public void onTerminating() {
        println("à bientôt");
    }

    private void showMenu() {
        println("Tapez 1 2 3 ou Q > ");
    }

    public static void main(String[] args) {
        new Menu123().run();
    }
}
