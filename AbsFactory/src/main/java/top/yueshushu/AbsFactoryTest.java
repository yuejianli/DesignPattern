package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.AbsFactory;
import top.yueshushu.one.Color;
import top.yueshushu.one.FactoryProducer;
import top.yueshushu.one.Shape;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class AbsFactoryTest {

    @Test
    public void oneTest() {
        AbsFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        AbsFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");

        // 装成成 红色的 圆
        circle.drawShape();
        red.fillColor();
    }
}
