package top.yueshushu.dimite.one;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */
@Slf4j
public class NewDeptManager {
    public List<Dept> findAll() {
        List<Dept> result = new ArrayList<>();

        for (int i = 0;i< 5;i++) {
            result.add(Dept.builder().id(i+1).name("随机部门"+i).build());
        }
        return result;
    }

    public void printAll () {
        List<Dept> deptAll = findAll();
        for (Dept dept: deptAll) {
            log.info(">>> 部门 {}", dept);
        }
    }
}
