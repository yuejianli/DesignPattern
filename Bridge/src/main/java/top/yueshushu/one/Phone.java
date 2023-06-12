package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public abstract class Phone {

    private Brand brand ;

    public Phone (Brand brand) {
        this.brand = brand;
    }

    public void sendMessage() {
       brand.sendMessage();
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
