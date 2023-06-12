package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class ChineseAbsOrderPizzaFactoryFactory implements AbsOrderPizzaFactory {

    @Override
    public Pizza createPizaa(String type) {
        if ("red".equalsIgnoreCase(type)){
            return new ChineseRedPizza();
        }else if ("blue".equalsIgnoreCase(type)){
            return new ChineseBluePizza();
        }else {
            return null;
        }
    }
}
