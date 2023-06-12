package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.HuaShengMilk;
import top.yueshushu.one.Milk;
import top.yueshushu.one.NoMilk;
import top.yueshushu.two.Fish;
import top.yueshushu.two.Food;
import top.yueshushu.two.Noodles;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class TemplateTest {

    @Test
    public void oneTest() {
        Milk milk = new HuaShengMilk();
        milk.make();
    }

    @Test
    public void twoTest() {
        Milk noMilk = new NoMilk();
        noMilk.make();
    }

    @Test
    public void foodTest() {
        Food food = new Fish();
        food.cookFood();

        food = new Noodles();
        food.cookFood();
    }
}
