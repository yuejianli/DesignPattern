package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.ActivityContext;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class StateTest {

    /**
     * 状态有: 不能抽奖，能抽奖
     *
     * 状态运转是:
     *
     * 不能抽奖--- > 能提奖---> 抽中了 (不能提奖 /活动结束了)
     */

    @Test
    public void oneTest() {
        ActivityContext activityContext = new ActivityContext(3);

        for (int i = 0; i < 10; i++) {
            log.info(">>> 第 {} 次抽奖", i + 1);
            activityContext.deductScore();
            // 抽奖
            activityContext.raffle();
        }
    }
}
