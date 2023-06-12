package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-06-05
 */
@Slf4j
public class Noodles extends Food {

    @Override
    protected void preparation() {
        log.info("准备面条，切葱花,烧开水");
    }

    @Override
    protected void make() {
        log.info("把面条放置滚水里面");
    }

    @Override
    protected void put() {
        log.info("捞出来，放碗里");
    }

    @Override
    protected void eat() {
        log.info("开始吃面条");
    }
}
