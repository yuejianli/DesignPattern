package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */
@Slf4j
public class ChineseBluePizza implements Pizza{

    @Override
    public void make() {
        log.info("制作中国蓝色披萨");
    }
}
