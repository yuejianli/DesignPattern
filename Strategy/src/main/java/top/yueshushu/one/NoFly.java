package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class NoFly implements FlyBehavior{

    @Override
    public void fly() {
        log.info("不能飞");
    }
}
