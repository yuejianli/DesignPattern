package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class LanSingle04 {
    private static LanSingle04 instance;

    private LanSingle04(){

    }

    public synchronized static LanSingle04 getInstance() {
        if (instance == null) {
            instance = new LanSingle04();
        }
        return instance;
    }
}


