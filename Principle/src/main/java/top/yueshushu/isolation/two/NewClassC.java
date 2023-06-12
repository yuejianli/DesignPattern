package top.yueshushu.isolation.two;

import top.yueshushu.isolation.one.InterfaceFive;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class NewClassC {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend4(Interface3 interface3) {
        interface3.operation4();
    }
    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}
