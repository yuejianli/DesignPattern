package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class FactoryProducer {

    public static AbsFactory getFactory (String type) {
        if ("color".equalsIgnoreCase(type)){
            return new ColorFactory();
        }else if ("shape".equalsIgnoreCase(type)){
            return new ShapeFactory();
        }else {
            return null;
        }
    }
}
