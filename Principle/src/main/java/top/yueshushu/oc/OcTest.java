package top.yueshushu.oc;

import org.junit.Test;
import top.yueshushu.oc.one.Circle;
import top.yueshushu.oc.one.DrawShape;
import top.yueshushu.oc.one.Rectangle;
import top.yueshushu.oc.two.NewCircle;
import top.yueshushu.oc.two.NewDrawShape;
import top.yueshushu.oc.two.NewRectangle;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class OcTest {

    @Test
    public void oneTest() {
        DrawShape drawShape = new DrawShape();
        drawShape.drawShape(new Rectangle());
        drawShape.drawShape(new Circle());
    }

    @Test
    public void twoTest() {
        NewDrawShape drawShape = new NewDrawShape();
        drawShape.drawShape(new NewRectangle());
        drawShape.drawShape(new NewCircle());
    }
}
