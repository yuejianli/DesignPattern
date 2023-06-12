package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class RedColor implements Color{

    @Override
    public void fillColor() {
        log.info("填充红色");
    }
}
