package stubs.base.REST.domains;

import stubs.base.REST.domains.Book;

import java.util.HashMap;

public class Books {

    public HashMap<String, Book> library;

    public Books() {
        this.library = new HashMap<>();
    }

    public String addBook(Book book) {
        library.put(book.getName(), book);
        return book.getName();
    }

    public Book getBook(String name) {
        Book book = library.get(name);
        return book;
    }

    public String deleteBook(String name) {
        library.remove(name);
        return name + " deleted";
    }

    public String toString() {
        StringBuilder string_representation = new StringBuilder();
        for (String name: library.keySet()) {
            String value = library.get(name).toString();
            string_representation.append(value);
        }
        return string_representation.toString();
    }

}
