package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        title = anotherBook.title;
        author = anotherBook.author;
        id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Book otherBook = (Book) obj;
        return id.equals(otherBook.id);
    }
}
