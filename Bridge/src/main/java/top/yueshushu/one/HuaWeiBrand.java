package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class HuaWeiBrand implements Brand{

    @Override
    public void sendMessage() {
        log.info("华为手机实现发送短信功能");
    }

    @Override
    public void open() {
        log.info("华为手机实现发送开机");
    }

    @Override
    public void close() {
        log.info("华为手机实现关机");
    }

    @Override
    public void call() {
        log.info("华为手机实现打电话");
    }
}
