package top.yueshushu.one;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
@Data
public abstract class AbstractDuckContext {
    private FlyBehavior flyBehavior;


    public AbstractDuckContext (FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     定义了公共的方法
     */
    public void speak(){
        log.info("可以叫");
    }

    public void swim() {
        log.info("可以游泳");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

}
