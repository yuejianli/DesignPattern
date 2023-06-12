package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class NewUser implements Observer {
    private String name;
    public NewUser(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        log.info("{} 观察到信息发生了变化 {}", name,arg);
    }
}
