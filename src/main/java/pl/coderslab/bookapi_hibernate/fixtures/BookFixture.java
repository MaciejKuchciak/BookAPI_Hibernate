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
            new Book(null, "9788324631766", "Game of Thrones", "George R. R. Martin", "Bantam Spectra", "fantasy"),
            new Book(null, "9788324627738", "Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly Media, Inc.", "programming"),
            new Book(null, "9780130819338", "The Lord of the Rings", "J.R.R. Tolkien", "Allen & Unwin", "fantasy"),
            new Book(null, "3901283092103", "The Witcher", "Andrzej Sapkowski", "SuperNowa", "fantasy"),
            new Book(null, "9140298320983", "The 7 Habits of Highly Effective People", "Stephen Covey", "Free Press", "self-development")
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
