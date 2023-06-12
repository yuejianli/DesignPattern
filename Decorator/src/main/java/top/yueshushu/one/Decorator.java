package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 装饰器
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class Decorator extends Drink{
    private Drink drink ;
    public Decorator (Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal cost() {
        // 之前的，加上现在的。
       return drink.cost().add(getPrice());
    }

    @Override
    public String getDesc() {
        return super.getDesc()+""+getPrice() +"&&" +drink.getDesc();
    }
}
