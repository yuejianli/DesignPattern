package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */
@Slf4j
public class EluosiRedPizza implements Pizza{

    @Override
    public void make() {
        log.info("制作俄罗斯红披萨");
    }
}
