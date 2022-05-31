package stubs.base.REST.controllers;

import org.springframework.web.bind.annotation.*;
import stubs.base.REST.domains.Books;

import stubs.base.REST.domains.Book;

@RestController
@RequestMapping("/")
public class BookController {

    Books books = new Books();

    @GetMapping("/books/{name}")
    public Book getBookById(@PathVariable("name") String name){

        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");
        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        Book book = books.getBook(name);
        return book;
    }

    @GetMapping("/books/all")
    public Books getAllBooks(){

        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");
        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        return books;
    }

    @PostMapping(value = "/books/add", consumes = "application/json", produces = "application/json")
    public Books addBook(@RequestBody Book book){

        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");
        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        books.addBook(book);

        return books;
    }

    @PostMapping(value = "/books/delete", consumes = "application/json", produces = "application/json")
    public Books deleteBook(@RequestBody Book book){

        Book book_1 = new Book("name", "Author", "2022");
        Book book_2 = new Book("name1", "Author1", "2022");
        Book book_3 = new Book("name2", "Author2", "2022");
        books.addBook(book_1);
        books.addBook(book_2);
        books.addBook(book_3);

        books.deleteBook(book.getName());

        return books;
    }

}
