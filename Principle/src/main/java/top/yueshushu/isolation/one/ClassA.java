package top.yueshushu.isolation.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class ClassA {
    public void depend1(InterfaceFive interfaceFive) {
        interfaceFive.operation1();
    }
    public void depend2(InterfaceFive interfaceFive) {
        interfaceFive.operation2();
    }
    public void depend3(InterfaceFive interfaceFive) {
        interfaceFive.operation3();
    }
}
