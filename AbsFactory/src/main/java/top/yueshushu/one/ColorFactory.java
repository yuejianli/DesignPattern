package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class ColorFactory implements AbsFactory{

    @Override
    public Color getColor(String type) {
        if ("red".equalsIgnoreCase(type)){
            return new RedColor();
        }else if ("blue".equalsIgnoreCase(type)){
            return new BlueColor();
        }else {
            return null;
        }
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
