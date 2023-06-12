package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class HightHouseBuilder extends HouseBuilder{

    @Override
    protected void buildBasic() {
        house.setBasic("地基100");
    }

    @Override
    protected void buildWalls() {
        house.setWall("砌墙20");
    }

    @Override
    protected void buildRoofed() {
        house.setRoofed("地板20");
    }
}
