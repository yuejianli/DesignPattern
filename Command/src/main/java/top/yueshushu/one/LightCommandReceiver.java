package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 命令实现者
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class LightCommandReceiver {
    public void on() {
        log.info("电灯打开了");
    }

    public void off() {
        log.info("电灯关闭了");
    }
}
