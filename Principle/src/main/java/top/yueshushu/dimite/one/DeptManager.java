package top.yueshushu.dimite.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */

public class DeptManager {
    public List<Dept> findAll() {
        List<Dept> result = new ArrayList<>();

        for (int i = 0;i< 5;i++) {
            result.add(Dept.builder().id(i+1).name("随机部门"+i).build());
        }
        return result;
    }
}
