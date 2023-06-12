package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Pizza;
import top.yueshushu.one.PizzaFactory;
import top.yueshushu.one.PizzaUtil;

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
        Pizza pizza = PizzaUtil.getPizza("eluosi");
        pizza.make();
    }

    @Test
    public void twoTest() {
        Pizza pizza = PizzaFactory.getPizza("mei");
        pizza.make();
    }




}
