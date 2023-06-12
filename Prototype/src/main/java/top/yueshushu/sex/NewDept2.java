package top.yueshushu.sex;

import lombok.Data;

import java.io.Serializable;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
public class NewDept2 implements Serializable,Cloneable{
    private Integer id;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
