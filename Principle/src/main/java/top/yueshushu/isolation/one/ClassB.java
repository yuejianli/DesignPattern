package top.yueshushu.isolation.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class ClassB implements InterfaceFive{

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

    @Override
    public void operation4() {
        log.info("B实现操作4");
    }

    @Override
    public void operation5() {
        log.info("B实现操作5");
    }
}
