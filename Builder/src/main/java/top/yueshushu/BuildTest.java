package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.AbstractHouse;
import top.yueshushu.one.HightHouse;
import top.yueshushu.one.SimpleHouse;
import top.yueshushu.three.Student;
import top.yueshushu.two.HightHouseBuilder;
import top.yueshushu.two.House;
import top.yueshushu.two.HouseDirector;
import top.yueshushu.two.SimpleHouseBuilder;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class BuildTest {

    @Test
    public void oneTest() {
        AbstractHouse simpleHouse = new SimpleHouse();
        simpleHouse.build();

        AbstractHouse hightHouse  = new HightHouse();
        hightHouse.build();
    }

    @Test
    public void twoTest() {
        HouseDirector houseDirector = new HouseDirector(new HightHouseBuilder());
        House house = houseDirector.build();
        log.info(">>> 打印高信息: {}", house);

        houseDirector.setHouseBuilder(new SimpleHouseBuilder());

        House noRoofHouse = houseDirector.noRoofBuild();
        log.info(">>> 打印低信息: {}", noRoofHouse);

        House house2 = houseDirector.build();
        log.info(">>> 打印低信息: {}", house2);
    }

    @Test
    public void threeTest() {
        Student student = Student.builder().id(1).name("张三").sex("男").build();
        log.info("学生信息: {}", student);
    }
}
