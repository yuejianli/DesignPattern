package top.yueshushu.dimite;

import org.junit.Test;
import top.yueshushu.dimite.one.DeptManager;
import top.yueshushu.dimite.one.NewDeptManager;
import top.yueshushu.dimite.one.UserManager;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-24
 */

public class DimiteTest {

    @Test
    public void testOne() {
        UserManager userManager = new UserManager();
        userManager.printAll(new DeptManager());
    }

    @Test
    public void testTwo() {
        UserManager userManager = new UserManager();
        userManager.printAll2(new NewDeptManager());
    }
}
