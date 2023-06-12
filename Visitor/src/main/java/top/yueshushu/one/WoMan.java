package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class WoMan extends Person{
    public WoMan (String name) {
       super.setName(name);
    }
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
