package BookManage;

//Create, Read, Update, Delete

import java.util.List;

public interface BookInterface {
    void create(BookClass book); // 갱신

    BookClass read(String id); // 검색

    void update(String id, BookClass book); // 수정

    void Delete(String id); //삭제

    List<BookClass> FindAll();  // 모든 도서 검색
}
