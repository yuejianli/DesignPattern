package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class SingleCoffee extends Coffee {

    public SingleCoffee() {
        setDesc("原咖啡");
        setPrice(new BigDecimal(10));
    }

}
