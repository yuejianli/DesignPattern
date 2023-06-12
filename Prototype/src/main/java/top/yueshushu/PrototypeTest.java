package top.yueshushu;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.five.NewDept;
import top.yueshushu.five.NewUser;
import top.yueshushu.four.Dept;
import top.yueshushu.four.User;
import top.yueshushu.one.Sheep;
import top.yueshushu.sex.NewDept2;
import top.yueshushu.sex.NewUser2;
import top.yueshushu.three.ThreeSheep;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class PrototypeTest {

    @Test
    public void oneTest (){

        Sheep sheep = new Sheep();
        sheep.setId(1);
        sheep.setName("羊");

        Sheep newSheep = sheep;
        log.info("新的 {}", newSheep);
        newSheep.setName("名称改变了:");
        log.info("改变后的名称: {}", newSheep);
        log.info("之前老的数据: {}", sheep);
    }

    @Test
    public void twoTest (){

        Sheep sheep = new Sheep();
        sheep.setId(1);
        sheep.setName("羊");

        Sheep newSheep = new Sheep();
        newSheep.setId(sheep.getId());
        newSheep.setName(sheep.getName());
        log.info("新的 {}", newSheep);
        newSheep.setName("名称改变了:");
        log.info("改变后的名称: {}", newSheep);
        log.info("之前老的数据: {}", sheep);
    }

    @Test
    public void threeTest () throws Exception{

        ThreeSheep sheep = new ThreeSheep();
        sheep.setId(1);
        sheep.setName("羊");

        ThreeSheep newSheep = (ThreeSheep) sheep.clone();

        newSheep.setId(sheep.getId());
        newSheep.setName(sheep.getName());
        log.info("新的 {}", newSheep);
        newSheep.setName("名称改变了:");
        log.info("改变后的名称: {}", newSheep);
        log.info("之前老的数据: {}", sheep);
    }

    @Test
    public void fourTest() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        Dept dept = new Dept();
        dept.setId(1);
        dept.setName("研发部");
        user.setDept(dept);

        log.info("构建用户: {}",user);
        User cloneUser = (User) user.clone();
        cloneUser.setName("张三Copy");
        log.info("克隆后的用户: {}",cloneUser);
        log.info("之前的用户: {}",user);

        // 会发现 ， Dept 同时改变了， 即 Dept 并没有 Copy 成功。
        cloneUser.getDept().setName("信息部");

        log.info("修改后的用户: {}",cloneUser);

        log.info("之前的用户: {}",user);
    }

    @Test
    public void fiveTest() throws Exception {
        NewUser user = new NewUser();
        user.setId(1);
        user.setName("张三");
        NewDept dept = new NewDept();
        dept.setId(1);
        dept.setName("研发部");
        user.setDept(dept);

        log.info("构建用户: {}",user);
        NewUser cloneUser = (NewUser) user.clone();
        cloneUser.setName("张三Copy");
        log.info("克隆后的用户: {}",cloneUser);
        log.info("之前的用户: {}",user);

        // 会发现 ， Dept 同时改变了， 即 Dept 并没有 Copy 成功。
        cloneUser.getDept().setName("信息部");

        log.info("修改后的用户: {}",cloneUser);

        log.info("之前的用户: {}",user);
    }

    @Test
    public void sexTest() throws Exception {
        NewUser2 user = new NewUser2();
        user.setId(1);
        user.setName("张三");
        NewDept2 dept = new NewDept2();
        dept.setId(1);
        dept.setName("研发部");
        user.setDept(dept);

        log.info("构建用户: {}",user);
        NewUser2 cloneUser = (NewUser2) user.deepClone();
        cloneUser.setName("张三Copy");
        log.info("克隆后的用户: {}",cloneUser);
        log.info("之前的用户: {}",user);

        // 会发现 ， Dept 同时改变了， 即 Dept 并没有 Copy 成功。
        cloneUser.getDept().setName("信息部");

        log.info("修改后的用户: {}",cloneUser);

        log.info("之前的用户: {}",user);
    }

    @Test
    public void sevenTest() {
        NewUser2 user = new NewUser2();
        user.setId(1);
        user.setName("张三");
        NewDept2 dept = new NewDept2();
        dept.setId(1);
        dept.setName("研发部");
        user.setDept(dept);

        log.info("构建用户: {}",user);
        // 通过第三方对象， 需要序列化接口。
        NewUser2 cloneUser = ObjectUtil.clone(user);
        cloneUser.setName("张三Copy");
        log.info("克隆后的用户: {}",cloneUser);
        log.info("之前的用户: {}",user);

        // 会发现 ， Dept 同时改变了， 即 Dept 并没有 Copy 成功。
        cloneUser.getDept().setName("信息部");

        log.info("修改后的用户: {}",cloneUser);

        log.info("之前的用户: {}",user);
    }

}
