package top.yueshushu.one;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 一个主体信息
 *
 * @author Yue Jianli
 * @date 2023-05-29
 */
@Data
public abstract class Drink {
    private BigDecimal price;
    private String desc;

    // 子类进行实现
    public abstract BigDecimal cost();

}
