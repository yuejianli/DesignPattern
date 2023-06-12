package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class DecoratorTest {

    @Test
    public void oneTest() {
        Drink drink = new SingleCoffee();
        log.info("单咖啡:{}",drink.cost());

        drink = new MilkDecorator(drink);

        drink = new TangDecorator(drink);

        log.info("加了牛奶和糖:{}", drink.cost());

        drink = new NaTieCoffee();

        log.info("拿铁:{}", drink.cost());

    }
}
