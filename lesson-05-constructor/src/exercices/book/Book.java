package exercices.book;
import java.util.Arrays;

/**
 * Book est une classe de type modèle ou entité
 * son rôle principal est de modéliser des objets du domaine de l'application
 */
public class Book {
    String title;
    String[] authors;
    String editor;
    String isbn;
    int year;

    public Book() {
    }

    public Book(String title, String[] authors, String editor, String isbn, int year) {
        this.title = title;
        this.authors = authors;
        this.editor = editor;
        this.isbn = isbn;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + "'" +
                ", authors=" + Arrays.toString(authors) +
                ", year=" + year +
                '}';
    }
}
