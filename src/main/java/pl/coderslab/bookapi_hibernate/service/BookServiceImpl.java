package pl.coderslab.bookapi_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.bookapi_hibernate.entity.Book;
import pl.coderslab.bookapi_hibernate.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    public List<Book> books = new ArrayList<>();

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book get(Long id) {
        return bookRepository.getOne(id);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.getOne(id);
    }
}