package eu.epfc.c4119.console;

import java.util.Scanner;

public class ScannerString {

    public static void main(String[] args) {
        String text = "Top!\nhello world\nOK\n";
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
