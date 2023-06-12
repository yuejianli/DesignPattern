package top.yueshushu.one;

import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Data
public abstract class OrgComponent {
    private String name;
    private String desc;


    public OrgComponent (String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add (OrgComponent orgComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(OrgComponent orgComponent) {
        throw new UnsupportedOperationException();
    }

    public OrgComponent getChild(int i) {return null;}

    public abstract void print();

}
