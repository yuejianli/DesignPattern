package top.yueshushu.one;

import lombok.Builder;
import lombok.Data;

/**
 * 这是要保存的对象， 是从实体中抽象出来的公共部分。
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Data
@Builder
public class Memento {
    /**
     攻击力，防御力，血量
     */
    private int vit;
    private int def;
    private int blood;
}
