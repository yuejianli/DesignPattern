package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.AbsOrderPizzaFactory;
import top.yueshushu.one.ChineseAbsOrderPizzaFactoryFactory;
import top.yueshushu.one.Pizza;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */
@Slf4j
public class PizzaTest {

    @Test
    public void oneTest() {

        AbsOrderPizzaFactory absOrderPizzaFactory = new ChineseAbsOrderPizzaFactoryFactory();

        Pizza pizza = absOrderPizzaFactory.createPizaa("red");

        pizza.make();

    }
}
