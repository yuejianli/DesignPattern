package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public abstract class Milk {

    public final  void make() {
        select();
        if (customerCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }
    void select() {
        log.info("第一步，选择好的黄豆");
    }

    // 添加信息，由子类去实现
    protected abstract void addCondiments();

    void soak() {
        log.info("第三步， 浸泡 3个小时");
    }

    void beat() {
        log.info("第四步: 打碎");
    }

    protected boolean customerCondiments() {
        return true;
    }

}
