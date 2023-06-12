package top.yueshushu;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-25
 */

public enum EnumSingle08 {
   INSTANCE("1");

    private String name;

    EnumSingle08(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


