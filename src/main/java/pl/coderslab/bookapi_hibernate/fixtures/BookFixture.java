package pl.coderslab.bookapi_hibernate.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.bookapi_hibernate.entity.Book;
import pl.coderslab.bookapi_hibernate.service.BookService;

import java.util.Arrays;
import java.util.List;

@Component
public class BookFixture {
    private BookService bookService;
    private List<Book> bookList = Arrays.asList(
            new Book(null, "9788324631766", "Game of Throne", "George Martin", "Zysk", "fantasy"),
            new Book(null, "9788324627738", "Krzyzacy", "Henryk Sienkiwicz", "TT", "fantasy"),
            new Book(null, "9780130819338", "Pan Wołodyjowski", "Henryk Sienkiewicz", "TT", "fantasy"),
            new Book(null, "3901283092103", "Chłopi", "Władysław Reymont", "ZNAK", "fantasy"),
            new Book(null, "9140298320983", "Samozwaniec", "Jacek Komuda", "Fabryka Słów", "fantasy")
    );

    @Autowired
    public BookFixture(BookService bookService) {
        this.bookService = bookService;

    }

    public void loadIntoDB() {
        for (Book book : bookList) {
            bookService.add(book);
        }
    }
}
