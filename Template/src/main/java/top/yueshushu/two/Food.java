package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-06-05
 */

public abstract class Food {

    public  void cookFood() {
        preparation();
        make();
        put();
        eat();
    }


    protected abstract  void preparation();

    protected abstract  void make();

    protected abstract void put();
    protected abstract  void eat();
}
