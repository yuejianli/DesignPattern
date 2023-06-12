package top.yueshushu.one;

import lombok.Data;

/**
 * 实体的抽象类
 * @author yuejianli
 * @date 2023-05-30
 */
@Data
public abstract class Colleague {
    private String name;
    private Mediator mediator;

    public Colleague (String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendCmd(String cmd);
}
