package eu.epfc.lesson10.demo;
import java.util.Scanner;

public abstract class PConsole {

    public final void run() {
        onInitialize();
        Scanner keyboard = new Scanner(System.in);
        boolean next;
        do {
            String line = keyboard.nextLine();
            next = onNewLine(line);
        }
        while(next);
        onTerminating();
    }

    public abstract void onInitialize();

    public abstract boolean onNewLine(String line);

    public abstract void onTerminating();

    public final void println(String line) {
        System.out.println(line);
    }

    public final void print(String line) {
        System.out.print(line);
    }
}