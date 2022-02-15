package l09.pconsole;

import java.util.Scanner;

public class PConsole {

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

    public void onInitialize()  {
    }

    public boolean onNewLine(String line) {
        return true;
    }

    public void onTerminating() {
    }

    public final void println(String line) {
        System.out.println(line);
    }

    public final void print(String line) {
        System.out.print(line);
    }
}
