package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class SimpleHouseBuilder extends HouseBuilder{

    @Override
    protected void buildBasic() {
        house.setBasic("地基10");
    }

    @Override
    protected void buildWalls() {
        house.setWall("砌墙2");
    }

    @Override
    protected void buildRoofed() {
        house.setRoofed("地板2");
    }
}
