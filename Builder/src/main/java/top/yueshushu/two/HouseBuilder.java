package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public abstract class HouseBuilder {

    protected House house = new House();

    protected abstract void buildBasic();
    protected abstract void buildWalls();
    protected abstract void buildRoofed();

    public House build() {
        buildBasic();
        buildWalls();
        buildRoofed();
        return house;
    }
}
