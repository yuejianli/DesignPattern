package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class ListenerAdapter implements Listener{

    @Override
    public void enter() {
        log.info("进入事件");
    }

    @Override
    public void leaver() {
        log.info("离开事件");
    }

    @Override
    public void mouse() {
        log.info("悬浮事件");
    }

    @Override
    public void change() {
        log.info("改变事件");
    }
}
