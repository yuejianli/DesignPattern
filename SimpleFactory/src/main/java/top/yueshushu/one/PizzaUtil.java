package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public class PizzaUtil {

    public static Pizza getPizza (String type) {
        if ("chinese".equalsIgnoreCase(type)){
            return new ChinesePizza();
        }else if ("mei".equalsIgnoreCase(type)){
            return new MeiPizza();
        }else if ("eluosi".equalsIgnoreCase(type)){
            return new EluosiPizza();
        }else {
            return null;
        }
    }
}
