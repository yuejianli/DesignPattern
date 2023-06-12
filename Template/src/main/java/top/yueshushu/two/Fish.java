package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-06-05
 */
@Slf4j
public class Fish extends Food{

    @Override
    protected void preparation() {
        log.info(">>> 准备买好的，已经处理过的活，简单再处理");
    }

    @Override
    protected void make() {
        log.info("烧水，把鱼放进去");
    }

    @Override
    protected void put() {
        log.info("把鱼放盘子里面，端上来");
    }

    @Override
    protected void eat() {
        log.info("吃鱼");
    }
}
