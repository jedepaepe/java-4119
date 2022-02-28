package eu.epfc.lesson10.exercices.filesystem;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Directory c2points = new Directory("c:");
        File fileText = new File("file.txt");

        c2points.add(fileText);
        System.out.println(c2points.fsRecords.get(0).name);
        fileText.parent = c2points;
        System.out.println(fileText.parent.name);

        Directory users = new Directory("users");
        c2points.add(users);
        users.parent = c2points;

        Directory jedepaepe = new Directory("jedepaepe");
        users.add(jedepaepe);
        jedepaepe.parent = users;

        File readme = new File("readme.md");
        jedepaepe.add(readme);
        readme.parent = jedepaepe;

        Scanner keyboard = new Scanner(System.in);
        keyboard.next();
    }
}
