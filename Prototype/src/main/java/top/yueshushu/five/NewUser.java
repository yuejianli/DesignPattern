package top.yueshushu.five;

import lombok.Data;
import top.yueshushu.four.Dept;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
public class NewUser implements Cloneable {
    private Integer id;
    private String name;
    private NewDept dept;

    @Override
    public Object clone() throws CloneNotSupportedException {
        NewUser newUser = (NewUser) super.clone();
        NewDept deptCopy = (NewDept) dept.clone();
        newUser.setDept(deptCopy);
        return newUser;
    }
}
