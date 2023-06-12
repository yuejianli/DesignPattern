package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class LanSingle05 {
    private static LanSingle05 instance;

    private LanSingle05(){

    }

    public static LanSingle05 getInstance() {
        if (instance == null) {
            synchronized (LanSingle05.class){
                instance = new LanSingle05();
            }
        }
        return instance;
    }
}


