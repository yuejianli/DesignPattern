package top.yueshushu.one;

import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Data
public class ActivityContext {
    private State state;
    private int count;
    // 构建这四个状态
    private State noChouState = new NoChouState(this);
    private State canChouState = new CanChouState(this);

    private State sendState = new SendState(this);
    private State sendOutState = new SendOutState(this);


    public ActivityContext(int count) {
        this.state = noChouState;
        this.count = count;
    }

    public void deductScore() {
       this.state.deductScore();
    }

    public void raffle() {
        if (this.state.raffle()){
            this.state.sendPrize();
        }
    }
}
