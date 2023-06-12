package top.yueshushu.sex;

import lombok.Data;
import top.yueshushu.five.NewDept;

import java.io.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Data
public class NewUser2 implements Serializable,Cloneable {
    private Integer id;
    private String name;
    private NewDept2 dept;

    @Override
    public Object clone() throws CloneNotSupportedException {
        NewUser2 newUser = (NewUser2) super.clone();
        NewDept2 deptCopy = (NewDept2) dept.clone();
        newUser.setDept(deptCopy);
        return newUser;
    }

    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            NewUser2 copyObj = (NewUser2)ois.readObject();
            return copyObj;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e) {

            }
        }
    }
}
