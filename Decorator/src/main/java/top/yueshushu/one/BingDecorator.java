package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class BingDecorator extends Decorator{

    public BingDecorator(Drink drink) {
        super(drink);
        setPrice(new BigDecimal(0));
        setDesc("冰");
    }
}
