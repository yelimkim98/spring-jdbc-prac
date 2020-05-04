package wooteco.chess.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import wooteco.chess.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    @Override
    List<Book> findAll();
}
