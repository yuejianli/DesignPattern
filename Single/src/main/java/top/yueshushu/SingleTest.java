package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */
@Slf4j
public class SingleTest {


    @Test
    public void oneTest() {
        Single01 single01 = Single01.getInstance();
        Single01 single02 = Single01.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void twoTest() {
        Single02 single01 = Single02.getInstance();
        Single02 single02 = Single02.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void threeTest() {
        LanSingle03 single01 = LanSingle03.getInstance();
        LanSingle03 single02 = LanSingle03.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void threadTest() throws Exception{
        for( int i = 0; i< 20; i++) {
            new Thread(()->{
                log.info(">>> 打印实例: {}", LanSingle05.getInstance());
            },i+"").start();
        }
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    public void fourTest() {
        LanSingle04 single01 = LanSingle04.getInstance();
        LanSingle04 single02 = LanSingle04.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }
    @Test
    public void fiveTest() {
        LanSingle05 single01 = LanSingle05.getInstance();
        LanSingle05 single02 = LanSingle05.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void sexTest() {
        CheckSingle06 single01 = CheckSingle06.getInstance();
        CheckSingle06 single02 = CheckSingle06.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void sevenTest() {
        InnerSingle07 single01 = InnerSingle07.getInstance();
        InnerSingle07 single02 = InnerSingle07.getInstance();

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }

    @Test
    public void nightTest() {
        EnumSingle08 single01 = EnumSingle08.INSTANCE;
        EnumSingle08 single02 = EnumSingle08.INSTANCE;

        log.info("是否相同: {}", single01 == single02);
        log.info(" hashcode 是否相同: {}", single01.hashCode() == single02.hashCode());
    }
}
