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
public class UserManager {

    public List<User> findAll() {
        List<User> result = new ArrayList<>();

        for (int i = 0;i< 5;i++) {
            result.add(User.builder().id(i+1).name("随机名称"+i).build());
        }

        return result;
    }


    public void printAll (DeptManager deptManager) {
        // 发现 在这个类里面 有 Dept 类，但这个类并不是 形参，成员变量，方法返回值， 不算是直接朋友。
        List<Dept> deptAll = deptManager.findAll();
        for (Dept dept: deptAll) {
            log.info(">>> 部门 {}", dept);
        }

        List<User> userAll = findAll();
        for (User user: userAll) {
            log.info(">>> 员工 {}", user);
        }
    }

    public void printAll2 (NewDeptManager newDeptManager) {
        newDeptManager.printAll();

        List<User> userAll = findAll();
        for (User user: userAll) {
            log.info(">>> 员工 {}", user);
        }
    }
}
