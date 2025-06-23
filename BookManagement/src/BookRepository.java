import java.util.List;

public interface BookRepository {
    void create(BookClass book);
    BookClass read(String id);
    void update(String id, BookClass book);       // 수정
    void delete(String id);                  // 삭제
    List<BookClass> findAll();
}
