package top.yueshushu.single;

import org.junit.Test;
import top.yueshushu.single.obj.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
public class SingleTest {

    @Test
    public void testA() {
        Run run = new Run();
        run.run("小汽车");
        run.run("飞机");
        run.run("鱼");
    }

    @Test
    public void testB() {
        LuRun luRun = new LuRun();
        luRun.run("小汽车");
        AirRun airRun = new AirRun();
        airRun.run("飞机");
        WaterRun waterRun = new WaterRun();
        waterRun.run("鱼");
    }

    @Test
    public void testC() {
        RunTotal runTotal = new RunTotal();
        runTotal.luRun("小汽车");
        runTotal.airRun("飞机");
        runTotal.waterRun("鱼");
    }
}
