package top.yueshushu.single.obj;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class RunTotal {
    public void luRun(String vehicle) {
        log.info(" {} 在公路上跑", vehicle);
    }

    public void airRun(String vehicle) {
        log.info(" {} 在空中飞", vehicle);
    }

    public void waterRun(String vehicle) {
        log.info(" {} 在水中游", vehicle);
    }
}
