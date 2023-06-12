package top.yueshushu.oc.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class DrawShape {

    public void drawShape( Shape shape) {
        if (shape.getType() == 0) {
            drawRectange();
        }else if (shape.getType() == 1) {
            drawCircle();
        }
    }

    private void drawCircle() {
        log.info(">>> 画圆");
    }

    private void drawRectange() {
        log.info(">>> 画方形");
    }
}
