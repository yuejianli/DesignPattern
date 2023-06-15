package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Book;
import top.yueshushu.one.BookShelf;
import top.yueshushu.one.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class IteratorTest {

    @Test
    public void oneTest() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("第一本书","第一本书"));
        bookShelf.appendBook(new Book("第二本书","第二本书"));
        bookShelf.appendBook(new Book("第三本书","第三本书"));
        bookShelf.appendBook(new Book("第四本书","第四本书"));
        bookShelf.appendBook(new Book("第五本书","第五本书"));

        MyIterator<Book> interator = bookShelf.getInterator();
        while (interator.hasNext()) {
            Book book = interator.next();
            log.info("打印信息: {}", book);
        }

        // 打印反转的信息.
        log.info(">>>> 倒序的信息");

        MyIterator<Book> reverseInterator = bookShelf.getReverseInterator();
        while (reverseInterator.hasNext()) {
            Book book = reverseInterator.next();
            log.info("打印信息: {}", book);
        }
    }

    @Test
    public void twoTest() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("第一本书","第一本书"));
        bookList.add(new Book("第二本书","第二本书"));
        bookList.add(new Book("第三本书","第三本书"));
        bookList.add(new Book("第四本书","第四本书"));
        bookList.add(new Book("第五本书","第五本书"));


        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            log.info("打印信息: {}", book);
        }

    }
}
