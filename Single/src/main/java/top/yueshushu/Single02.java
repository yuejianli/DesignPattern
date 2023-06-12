package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class Single02 {
    private static Single02 instance ;
    static {
        instance = new Single02();
    }
    private Single02 (){

    }

    public static Single02 getInstance() {
        return instance;
    }
}
