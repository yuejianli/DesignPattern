package top.yueshushu.four;

import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
public class Dept implements Cloneable{
    private Integer id;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
