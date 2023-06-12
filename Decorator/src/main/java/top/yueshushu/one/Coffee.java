package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class Coffee extends Drink{

    @Override
    public BigDecimal cost() {
        // 计算价格
      return super.getPrice();
    }
}
