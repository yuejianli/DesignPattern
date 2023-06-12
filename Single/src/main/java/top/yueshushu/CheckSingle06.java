package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class CheckSingle06 {
    private static volatile CheckSingle06 instance;

    private CheckSingle06(){

    }

    public static CheckSingle06 getInstance() {
        if (instance == null) {
            synchronized (CheckSingle06.class){
               if (instance == null) {
                   instance = new CheckSingle06();
               }
            }
        }
        return instance;
    }
}


