package top.yueshushu.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class BookShelf implements Aggregate<Book>{
    private List<Book> bookList = new ArrayList<>();

    @Override
    public MyIterator<Book> getInterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public MyIterator<Book> getReverseInterator() {
        return new BookShelfReverseIterator(this);
    }

    public Integer getLength() {
        return bookList.size();
    }

    public void appendBook(Book book) {
        this.bookList.add(book);
    }
    public Book getBookAt(Integer position) {
        return this.bookList.get(position);
    }
}
