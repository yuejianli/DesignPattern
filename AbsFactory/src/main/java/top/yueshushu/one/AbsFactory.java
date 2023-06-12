package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public interface AbsFactory {
    Color getColor(String type);
    Shape getShape(String type);
}
