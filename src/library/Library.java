package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<books> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(books book) {
        books.add(book);
    }

    public void removeBook(books book) {
        books.remove(book);
    }

    public List<books> getBooks() {
        return books;
    }

    public books findBookById(int id) {
        for (books book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}

