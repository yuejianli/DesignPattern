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
    /**
     一个其他的类型操作,类似于不同的套餐
     */
    public House noRoofBuild () {
        buildBasic();
        buildWalls();
        return house;
    }
}
