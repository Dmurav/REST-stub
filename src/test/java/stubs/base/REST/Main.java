package stubs.base.REST;

import stubs.base.REST.domains.Books;
import stubs.base.REST.domains.Book;

public class Main {

    public static void main(String[] args) {

        String name = "name";
        String oneBook = getBookById(name);
        // System.out.println(oneBook);

        String allBooks = getAllBooks();
        System.out.println(allBooks);

    }

    public static String getBookById(String name) {
        Books books = new Books();
        Book book_1 = new Book("name", "Author", "2022");
        books.addBook(book_1);
        Book book = books.getBook(name);
        return book.toString();
    }

    public static String getAllBooks() {
        Books books = new Books();
        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");
        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        String allBooks = books.toString();

        return allBooks;
    }

    public static String addBook(Book book) {
        Books books = new Books();
        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");

        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        books.addBook(book);

        String allBooks = books.toString();
        return allBooks;
    }

}
