package top.yueshushu.one;

import java.math.BigDecimal;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class QiaoKeLiDecorator extends Decorator{

    public QiaoKeLiDecorator(Drink drink) {
        super(drink);
        setPrice(new BigDecimal(3));
        setDesc("巧克力");
    }
}
