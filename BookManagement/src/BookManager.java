import java.util.*;

public class BookManager implements BookRepository {
    private Map<String, BookClass> books = new HashMap<>();

    @Override
    public void create(BookClass book) {
        books.put(book.getId(), book);
    }

    @Override
    public BookClass read(String id) {
        return books.get(id);
    }

    @Override
    public void update(String id, BookClass book) {
        books.put(id, book);
    }

    @Override
    public void delete(String id) {
        books.remove(id);
    }

    @Override
    public List<BookClass> findAll() {
        return new ArrayList<>(books.values());
    }
}
