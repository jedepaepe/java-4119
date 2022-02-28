package exercices.book;

import java.util.ArrayList;

/**
 * une classe de démonstration
 * pour montrer comment manipuler la classe Book
 */
public class DemoBook {
    public static void main(String[] args) {
        solution1();
        solution2();
        solution3();
        solution5();
    }

    private static void solution1() {
        System.out.println("\n\tsolution1");
        Book odyssee = new Book("Odyssée", new String[]{"Homer"}, "Flamarion", "456-15654-45", -700);
        Book miserables = new Book("Les misérables", new String[]{"Victor Hugo"}, "Poche", "111-11111-11", 1838);
        Book bourgeois = new Book("Le bourgeois gentilhomme", new String[]{"Molière"}, "Poche", "111-12121-11", 1652);
        Book[] classicBooks = new Book[3];
        classicBooks[0] = odyssee;
        classicBooks[1] = miserables;
        classicBooks[2] = bourgeois;
        // foreach
        for(Book b : classicBooks) {
            System.out.println(b.toString());
        }
        // for classique
        System.out.println();
        for (int i = 0; i < classicBooks.length; ++i) {
            System.out.println(classicBooks[i].toString());
        }
    }

    private static void solution2() {
        System.out.println("\n\tsolution3");
        Book odyssee = new Book("Odyssée", new String[]{"Homer"}, "Flamarion", "456-15654-45", -700);
        Book miserables = new Book("Les misérables", new String[]{"Victor Hugo"}, "Poche", "111-11111-11", 1838);
        Book bourgeois = new Book("Le bourgeois gentilhomme", new String[]{"Molière"}, "Poche", "111-12121-11", 1652);
        // littéral de tableau
        Book[] books = new Book[] { odyssee, miserables, bourgeois };
        // foreach
        for(Book b : books) {
            System.out.println(b.toString());
        }
        // for classique
        System.out.println();
        for (int i = 0; i < books.length; ++i) {
            System.out.println(books[i].toString());
        }
    }

    private static void solution3() {
        System.out.println("\n\tsolution3");
        // littéral de tableau
        Book[] books = new Book[] {
                new Book("Odyssée", new String[]{"Homer"}, "Flamarion", "456-15654-45", -700),
                new Book("Les misérables", new String[]{"Victor Hugo"}, "Poche", "111-11111-11", 1838),
                new Book("Le bourgeois gentilhomme", new String[]{"Molière"}, "Poche", "111-12121-11", 1652)
        };
        // foreach
        for(Book b : books) {
            System.out.println(b);
        }
        // for classique
        System.out.println();
        for (int i = 0; i < books.length; ++i) {
            System.out.println(books[i]);
        }
    }

    public static void solution5() {
        System.out.println("\n\tsolution2");
        Book odyssee = new Book("Odyssée", new String[]{"Homer"}, "Flamarion", "456-15654-45", -700);
        Book miserables = new Book("Les misérables", new String[]{"Victor Hugo"}, "Poche", "111-11111-11", 1838);
        Book bourgeois = new Book("Le bourgeois gentilhomme", new String[]{"Molière"}, "Poche", "111-12121-11", 1652);
        ArrayList<Book> books = new ArrayList<>();
        books.add(odyssee);
        books.add(miserables);
        books.add(bourgeois);
        // foreach
        for (Book b : books) {
            System.out.println(b.toString());
        }
        // for classique
        System.out.println();
        for (int i = 0; i < books.size(); ++i) {
            System.out.println(books.get(i).toString());
        }
    }
}
