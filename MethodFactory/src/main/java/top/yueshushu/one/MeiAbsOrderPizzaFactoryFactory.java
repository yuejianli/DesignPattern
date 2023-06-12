package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class MeiAbsOrderPizzaFactoryFactory implements AbsOrderPizzaFactory {

    @Override
    public Pizza createPizaa(String type) {
        if ("red".equalsIgnoreCase(type)){
            return new MeiRedPizza();
        }else if ("blue".equalsIgnoreCase(type)){
            return new MeiBluePizza();
        }else {
            return null;
        }
    }
}
