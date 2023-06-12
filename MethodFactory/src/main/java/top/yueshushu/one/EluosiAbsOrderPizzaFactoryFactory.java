package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class EluosiAbsOrderPizzaFactoryFactory implements AbsOrderPizzaFactory {

    @Override
    public Pizza createPizaa(String type) {
        if ("red".equalsIgnoreCase(type)){
            return new EluosiRedPizza();
        }else if ("blue".equalsIgnoreCase(type)){
            return new EluosiBluePizza();
        }else {
            return null;
        }
    }
}
