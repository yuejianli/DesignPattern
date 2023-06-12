package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public abstract class AbstractHouse {
    protected abstract void buildBasic();
    protected abstract void buildWalls();
    protected abstract void buildRoofed();

    public void build () {
        buildBasic();
        buildWalls();
        buildRoofed();
    }
}
