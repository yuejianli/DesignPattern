package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class BookShelfIterator implements MyIterator<Book>{
    private BookShelf bookShelf;

    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }
    @Override
    public boolean hasNext() {
        return bookShelf.getLength() > index;
    }

    @Override
    public Book next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }

}
