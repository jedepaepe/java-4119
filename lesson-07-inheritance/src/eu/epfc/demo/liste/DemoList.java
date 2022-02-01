package eu.epfc.demo.liste;

import eu.epfc.demo.contact.Person;

import java.util.ArrayList;

public class DemoList {

    public static void main(String[] args) {
        // array (tableau)
        int[] ints = new int[4];
        int bints[] = new int[4];
        Person[] persons = new Person[10];
        persons[0] = new Person();

        // pas de limite de taille
        ArrayList<Person> person2s = new ArrayList<>();
        person2s.add(new Person());
    }
}
