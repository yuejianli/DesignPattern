package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class Facade {

    User user = new User();
    Dept dept = new Dept();
    UserRole userRole = new UserRole();

    public void addUser() {
        // 进行的操作
        user.addUser();
        dept.joinDept();
        userRole.applyRole();
        user.hello();
    }
}
