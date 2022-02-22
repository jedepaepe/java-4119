package eu.epfc.lesson10.exercices.filesystem;

import java.util.ArrayList;

public class Directory extends FSRecord {
    public ArrayList<FSRecord> fsRecords = new ArrayList<>();

    public Directory() {}

    public Directory(String name) {
        this.name = name;
    }

    public void add(Directory directory) {
        fsRecords.add(directory);
    }

    public void add(File file) {
        fsRecords.add(file);
    }
}
