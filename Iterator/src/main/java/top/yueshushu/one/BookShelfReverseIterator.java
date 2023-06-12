package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class BookShelfReverseIterator implements MyIterator<Book>{
    private BookShelf bookShelf;

    private int index = -1;

    public BookShelfReverseIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength()-1;
    }
    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        Book bookAt = bookShelf.getBookAt(index);
        index--;
        return bookAt;
    }

}
