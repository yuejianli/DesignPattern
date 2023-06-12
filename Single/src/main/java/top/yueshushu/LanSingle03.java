package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class LanSingle03 {
    private static LanSingle03 instance;

    private LanSingle03 (){

    }

    public static LanSingle03 getInstance() {
        if (instance == null) {
            instance = new LanSingle03();
        }
        return instance;
    }
}


