package top.yueshushu.one;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@EqualsAndHashCode(of = {"name"})
public abstract class Person {
    private String name;

    public abstract  void accept(Action action);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
