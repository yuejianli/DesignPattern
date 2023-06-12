package top.yueshushu.one;

import org.w3c.dom.css.Rect;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class ShapeFactory implements AbsFactory{

    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if ("circle".equalsIgnoreCase(type)){
            return new CircleShape();
        }else if ("rect".equalsIgnoreCase(type)){
            return new RectangeShape();
        }else {
            return null;
        }
    }
}
