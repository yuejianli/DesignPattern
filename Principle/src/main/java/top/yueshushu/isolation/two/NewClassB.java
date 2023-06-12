package top.yueshushu.isolation.two;

import lombok.extern.slf4j.Slf4j;
import top.yueshushu.isolation.one.InterfaceFive;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class NewClassB implements Interface1,Interface2 {

    @Override
    public void operation1() {
        log.info("B实现操作1");
    }

    @Override
    public void operation2() {
        log.info("B实现操作2");
    }

    @Override
    public void operation3() {
        log.info("B实现操作3");
    }

}
