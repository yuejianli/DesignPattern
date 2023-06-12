package top.yueshushu.isolation;

import org.junit.Test;
import top.yueshushu.isolation.one.ClassA;
import top.yueshushu.isolation.one.ClassB;
import top.yueshushu.isolation.one.ClassC;
import top.yueshushu.isolation.one.ClassD;
import top.yueshushu.isolation.two.NewClassA;
import top.yueshushu.isolation.two.NewClassB;
import top.yueshushu.isolation.two.NewClassC;
import top.yueshushu.isolation.two.NewClassD;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class IsolationTest {

    @Test
    public void testOne() {
        ClassA classA = new ClassA();
        classA.depend1(new ClassB());
        classA.depend2(new ClassB());
        classA.depend3(new ClassB());

        // 对 C 处理
        ClassC classC = new ClassC();
        classC.depend1(new ClassD());
        classC.depend4(new ClassD());
        classC.depend5(new ClassD());
    }

    /**
     将接口 拆分成   1   23   45
     分别去依赖使用，  这样 A 不会拥有 4，5 功能 ， C 不会拥有 1,2功能。
     即将 接口的能力进行了约束
     */
    @Test
    public void testTwo() {
        NewClassA classA = new NewClassA();
        classA.depend1(new NewClassB());
        classA.depend2(new NewClassB());
        classA.depend3(new NewClassB());

        // 对 C 处理
        NewClassC classC = new NewClassC();
        classC.depend1(new NewClassD());
        classC.depend4(new NewClassD());
        classC.depend5(new NewClassD());
    }
}
