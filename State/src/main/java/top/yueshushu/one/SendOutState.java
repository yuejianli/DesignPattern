package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class SendOutState extends State{
    private ActivityContext activityContext;

    public SendOutState(ActivityContext activityContext) {
        this.activityContext = activityContext;
    }

    @Override
    public void deductScore() {
       log.info(">>> 奖品发送完了，请下次参加");
    }

    @Override
    public boolean raffle() {

        log.info(">>> 奖品发送完了，请下次参加");
        return false;
    }

    @Override
    public void sendPrize() {
        log.info(">>> 奖品发送完了，请下次参加");
    }
}
