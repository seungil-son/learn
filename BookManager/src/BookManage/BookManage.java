package BookManage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManage implements BookInterface {
    private Map<String , BookClass> books = new HashMap();

    @Override
    public void create(BookClass book)
    {
        books.put(book.getId(), book);
    }
    @Override
    public  BookClass read(String id){
        return books.get(id);
    }
    @Override
    public void update(String id, BookClass updatedBook) {
        BookClass existing = books.get(id);
        if (existing != null) {
            existing.setTitle(updatedBook.getTitle());
            existing.setAuthor(updatedBook.getAuthor());
        }
    }
    @Override
    public void Delete(String id)
    {
        books.remove(id);
    }
    public List<BookClass> FindAll(){
        return new ArrayList<>(books.values());
    }

}
