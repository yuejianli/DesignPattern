package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Phone;
import top.yueshushu.one.Voltage220V;
import top.yueshushu.one.VoltageAdapter;
import top.yueshushu.one.VoltageAdapter2;
import top.yueshushu.two.Listener;
import top.yueshushu.two.ListenerAdapter;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class AdapterTest {

    @Test
    public void oneTest() {
        Phone phone = new Phone();
        phone.setName("小米手机");
        phone.chargeOld( new Voltage220V());
    }

    @Test
    public void twoTest() {
        Phone phone = new Phone();
        phone.setName("小米手机");
        // 定义一个适配器， 在适配器进行转换处理。
        phone.charge( new VoltageAdapter());
    }


    @Test
    public void threeTest() {
        Phone phone = new Phone();
        phone.setName("小米手机");
        // 定义一个适配器， 在适配器进行转换处理。
        phone.charge( new VoltageAdapter2(new Voltage220V()));
    }

    /**
     需要接口全部都实现
     */
    @Test
    public void listenerTest1() {
        // 使用匿名内部类
        useListener(new Listener() {
            @Override
            public void enter() {
                log.info("进入事件");
            }

            @Override
            public void leaver() {
                log.info("离开事件");
            }

            @Override
            public void mouse() {
                log.info("悬浮事件");
            }

            @Override
            public void change() {
                log.info("改变事件");
            }
        });
    }

    public void useListener( Listener listener) {
        log.info(">>>>>>>>>>>>>>>>>>只 实现一个 change 方法");
        listener.change();
    }

    /**
     使用谁，则只处理谁
     */
    @Test
    public void listenerTest2() {
        // 使用匿名内部类
        useListener(new ListenerAdapter() {
            @Override
            public void change() {
                log.info("改变事件");
            }
        });
    }


}
