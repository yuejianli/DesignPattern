package top.yueshushu.three;

import lombok.Data;

/**
 *
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
public class ThreeSheep implements Cloneable{

    private Integer id;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
