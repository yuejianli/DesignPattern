package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class Voltage220V {

    public int output220V() {
        int src = 220;
        log.info("电压是: {} V", src);
        return src;
    }
}
