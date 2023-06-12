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
public class NewClassD implements Interface1,Interface3 {

    @Override
    public void operation1() {
        log.info("D实现操作1");
    }

    @Override
    public void operation4() {
        log.info("D实现操作4");
    }

    @Override
    public void operation5() {
        log.info("D实现操作5");
    }
}
