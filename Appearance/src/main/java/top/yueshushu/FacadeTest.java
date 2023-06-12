package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Dept;
import top.yueshushu.one.Facade;
import top.yueshushu.one.User;
import top.yueshushu.one.UserRole;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class FacadeTest {

    @Test
    public void oneTest() {
        User user = new User();
        Dept dept = new Dept();
        UserRole userRole = new UserRole();
        log.info(">>>>> 新员工入职流程");
        // 进行的操作
        user.addUser();
        dept.joinDept();
        userRole.applyRole();
        user.hello();

    }

    @Test
    public void twoTest() {
        log.info(">>>>> 新员工入职流程");
        Facade facade = new Facade();
        facade.addUser();
    }
}
