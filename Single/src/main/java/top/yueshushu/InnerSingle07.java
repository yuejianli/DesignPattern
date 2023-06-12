package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class InnerSingle07 {
    private InnerSingle07(){

    }

    private static class InnerClass {
        private static final InnerSingle07 INSTANCE = new InnerSingle07();
    }


    public static InnerSingle07 getInstance() {
       return InnerClass.INSTANCE;
    }
}


