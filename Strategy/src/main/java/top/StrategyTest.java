package top;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;
import top.yueshushu.two.AddStrategy;
import top.yueshushu.two.CalcStrategyContext;
import top.yueshushu.two.SubStrategy;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class StrategyTest {

    @Test
    public void oneTest() {
        AbstractDuckContext tianE = new TianE(new GoodFly());
        tianE.fly();
        log.info(">>>>> 这只天鹅受伤了");
        // 设置一下
        tianE.setFlyBehavior(new BadFly());
        tianE.getFlyBehavior().fly();
        log.info(">>>>> 这只天鹅翅膀被人打断了");
        tianE.setFlyBehavior(new NoFly());
        tianE.getFlyBehavior().fly();
    }

    @Test
    public void twoTest() {
        CalcStrategyContext calcStrategyContext = new CalcStrategyContext(new AddStrategy());
        int calc = calcStrategyContext.calc(5, 1);
        log.info(">>> 加法: {}", calc);

        calcStrategyContext.setCalcStrategy(new SubStrategy());
        calc = calcStrategyContext.calc(5, 1);
        log.info(">>> 减法: {}", calc);
    }
}
