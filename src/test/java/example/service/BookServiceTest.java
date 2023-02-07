package example.service;

import example.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

public class BookServiceTest extends AbstractTest {
    @Autowired
    private BookService bookService;

    @Test
    @Sql(value = "classpath:datasets/sample-dataset.sql")
    public void testGetAllBooks() {
        final List<Book> all = bookService.getAll();

        Assertions.assertEquals(8, all.size());

    }
}
