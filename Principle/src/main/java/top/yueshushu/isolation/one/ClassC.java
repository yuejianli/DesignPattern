package top.yueshushu.isolation.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class ClassC {
    public void depend1(InterfaceFive interfaceFive) {
        interfaceFive.operation1();
    }
    public void depend4(InterfaceFive interfaceFive) {
        interfaceFive.operation4();
    }
    public void depend5(InterfaceFive interfaceFive) {
        interfaceFive.operation5();
    }
}
