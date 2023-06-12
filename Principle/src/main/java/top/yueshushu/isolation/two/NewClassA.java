package top.yueshushu.isolation.two;

import top.yueshushu.isolation.one.InterfaceFive;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class NewClassA {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }
    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}
