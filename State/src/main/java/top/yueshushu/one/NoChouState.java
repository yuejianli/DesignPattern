package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 *
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class NoChouState extends State{
    private ActivityContext activityContext;

    public NoChouState(ActivityContext activityContext) {
        this.activityContext = activityContext;
    }

    @Override
    public void deductScore() {
       log.info(">>> 扣除积分成功");
       activityContext.setState(activityContext.getCanChouState());
    }

    @Override
    public boolean raffle() {
        log.info(">>> 扣了积分才能抽");
        return false;
    }

    @Override
    public void sendPrize() {
        log.info(">>> 未抽奖，不发放奖品");
    }
}
