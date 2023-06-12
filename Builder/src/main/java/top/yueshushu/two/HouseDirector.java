package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector (HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build () {
        return this.houseBuilder.build();
    }

}
