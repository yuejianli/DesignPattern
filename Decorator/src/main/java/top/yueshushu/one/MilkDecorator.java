package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class MilkDecorator extends Decorator{

    public MilkDecorator(Drink drink) {
        super(drink);
        setPrice(new BigDecimal(2));
        setDesc("牛奶");
    }
}
