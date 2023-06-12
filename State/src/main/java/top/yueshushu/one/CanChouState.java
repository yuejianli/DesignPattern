package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 *
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class CanChouState extends State{
    private ActivityContext activityContext;

    public CanChouState (ActivityContext activityContext) {
        this.activityContext = activityContext;
    }

    @Override
    public void deductScore() {
       log.info(">>> 不能调用扣取积分方法");
    }

    @Override
    public boolean raffle() {

        // 生成一个随机数
        int randNum = new Random().nextInt(3);
        if (randNum == 0) {
            //改变状态
            activityContext.setState(activityContext.getSendState());
            return true;
        }else {
            activityContext.setState(activityContext.getNoChouState());
            return false;
        }
    }

    @Override
    public void sendPrize() {
        log.info(">>> 没有中奖，不发放奖品");
    }
}
