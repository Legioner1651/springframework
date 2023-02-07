package example.service;

import example.model.Book;
import example.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookAnalyticService {
    private final BookRepository bookRepository;

    public String analyze() {
        final List<Book> books = bookRepository.findAll();
        if (books.isEmpty()) {
            return "Нет данных для анализа";
        }
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor))
                .entrySet().stream()
                .map(e -> e.getKey().getLastName() + " " + e.getKey().getFirstName() + " : " + e.getValue().size())
                .collect(Collectors.joining(", "));
    }
}
