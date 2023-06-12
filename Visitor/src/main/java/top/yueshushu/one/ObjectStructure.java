package top.yueshushu.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void accept( Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void display (Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
