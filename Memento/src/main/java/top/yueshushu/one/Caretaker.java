package top.yueshushu.one;

import java.util.HashMap;
import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class Caretaker {

    private Map<String,Memento> statusMap = new HashMap<>();


    // 根据 标识获取信息

    public Memento getByStatus (String status) {
        return statusMap.get(status);
    }

    public void saveStatus (String status, Memento memento) {
        statusMap.put(status,memento);
    }


}
