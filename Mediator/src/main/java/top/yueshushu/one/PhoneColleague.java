package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class PhoneColleague extends Colleague{

    public PhoneColleague(String name, Mediator mediator) {
        super(name,mediator);
        // 注册到中介集合里面。
        mediator.register(name,this);
    }

    @Override
    public void sendCmd(String cmd) {
        getMediator().getCmdMessage(this.getName(),cmd);
    }

    public void call() {
        log.info(">>> {} 打电话",super.getName());
    }

    public void wx() {
        log.info(">>>>> {}打开微信",super.getName());
    }
    
}
