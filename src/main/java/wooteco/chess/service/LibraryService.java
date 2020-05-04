package wooteco.chess.service;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;
import wooteco.chess.model.Book;
import wooteco.chess.repository.BookRepository;

@Service
public class LibraryService {

    private BookRepository bookRepository;

    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> loadAllBooks() {
        return Collections.unmodifiableList(bookRepository.findAll());
    }

    public void addBook(String bookName, String bookAuthor) {
        bookRepository.save(new Book(bookName, bookAuthor));
    }
}
