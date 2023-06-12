package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */
@Slf4j
public class ChinesePizza implements Pizza{

    @Override
    public void make() {
        log.info("制作 中国 Pizza");
    }
}
