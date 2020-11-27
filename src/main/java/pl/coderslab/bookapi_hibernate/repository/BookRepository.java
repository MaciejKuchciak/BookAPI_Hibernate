package pl.coderslab.bookapi_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.bookapi_hibernate.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("Select b from Book b")
    List<Book> getBooks();

    @Query("SELECT b FROM Book b WHERE b.id = :id")
    Book findBookById(@Param("id") Long id);
}
