package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public abstract class State {
    /**
      减少积分
     */
    public abstract  void deductScore();
    /**
     是否抽中奖品
     */
    public abstract  boolean raffle();
    /**
    获取奖品
     */
    public abstract  void sendPrize();

}
