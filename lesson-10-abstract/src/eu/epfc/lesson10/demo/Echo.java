package eu.epfc.lesson10.demo;

public class Echo extends PConsole {
    @Override
    public void onInitialize() {
        print("Je suis écho, parle");
    }

    @Override
    public boolean onNewLine(String line) {
        println(line);
        print("parle encore");
        return true;
    }

    @Override
    public void onTerminating() {

    }

    public static void main(String[] args) {
        new Echo().run();
    }
}
