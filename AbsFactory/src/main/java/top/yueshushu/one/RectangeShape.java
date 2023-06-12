package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class RectangeShape implements Shape{

    @Override
    public void drawShape() {
        log.info("画矩形");
    }
}
