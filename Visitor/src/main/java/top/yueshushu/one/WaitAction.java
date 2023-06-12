package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class WaitAction extends Action{

    @Override
    public void getManResult(Man man) {
        log.info("男生{} 待评价",man.getName());
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        log.info("女生{}待评价",woMan.getName());
    }
}
