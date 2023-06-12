package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class SendState extends State{
    private ActivityContext activityContext;

    public SendState(ActivityContext activityContext) {
        this.activityContext = activityContext;
    }

    @Override
    public void deductScore() {
       log.info(">>> 不扣除积分");
    }

    @Override
    public boolean raffle() {

        log.info("抽过奖了");
        return false;
    }

    @Override
    public void sendPrize() {
        if (activityContext.getCount() >0) {
            log.info("中奖了");
            activityContext.setCount(activityContext.getCount()-1);
            activityContext.setState(activityContext.getNoChouState());
        } else {
            log.info(">>> 抽奖活动结束了");
            activityContext.setState(activityContext.getSendOutState());
        }
    }
}
