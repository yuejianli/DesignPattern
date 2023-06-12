package top.yueshushu.one;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 要处理的角色实体。
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Data
@Slf4j
public class GameRole {
    /**
     攻击力，防御力，血量
     */
    private int vit;
    private int def;
    private int blood;
    private String name;
    private String field1;

    public Memento createMemento() {
        return Memento.builder()
                .vit(vit)
                .def(def)
                .blood(blood)
                .build();
    }

    // 恢复状态
    public void recoverFromMemento( Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
        this.blood = memento.getBlood();
    }

    public void display() {
        log.info("当前 攻击力是: {}, 防御力: {},血量:{}",vit,def,blood);
    }
}
