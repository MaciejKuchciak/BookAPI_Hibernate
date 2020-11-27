package pl.coderslab.bookapi_hibernate.service;

import pl.coderslab.bookapi_hibernate.entity.Book;

import java.util.List;


public interface BookService {

    List<Book> getBooks();

    void add(Book book);

    Book get(Long id);

    void delete(Long id);

    void update(Book book);

    Book findById(Long id);
}
