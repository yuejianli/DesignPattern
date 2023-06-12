package top.yueshushu;

/**
 *
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class Single01 {
    /**
    类的内部创建对象
     final static
     */
    private final static Single01 instance = new Single01();
    /**
    构建方法地私有化
     */
    private Single01() {

    }
    /**
      对外提供一个静态的公共方法
     */
    public static Single01 getInstance() {
        return instance;
    }
}
