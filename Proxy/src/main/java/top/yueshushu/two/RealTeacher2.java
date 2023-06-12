package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class RealTeacher2 implements ITeacher2{

    @Override
    public void talk() {
        log.info("老师正在讲课");
    }

    @Override
    public void hello(String name) {
        log.info("你好啊 {}", name);
    }
}
