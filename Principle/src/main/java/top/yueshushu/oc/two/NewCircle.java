package top.yueshushu.oc.two;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class NewCircle implements NewShape{

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public void drawShape() {
        log.info(">>> 画圆形");
    }
}
