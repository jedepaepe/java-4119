package eu.epfc.c4119.lesson11.palindrome;

import java.util.Scanner;

public class PConsole {
    public void run() {
        Scanner keyboard = new Scanner(System.in);
        onStart();
        do {
            String line = keyboard.nextLine();
            if (! onNewLine(line)) break;
        } while (true);
        onStop();
    }

    public void onStop() {
    }

    public boolean onNewLine(String line) {
        return true;
    }

    public void onStart() {
    }

    public final void print(String text) {
        System.out.print(text);
    }

    public final void println(String text) {
        System.out.println(text);
    }
}
