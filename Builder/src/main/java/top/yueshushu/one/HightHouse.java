package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class HightHouse extends AbstractHouse{

    @Override
    protected void buildBasic() {
        log.info("高楼打地基");
    }

    @Override
    protected void buildWalls() {
        log.info("高楼砌墙壁");
    }

    @Override
    protected void buildRoofed() {
        log.info("高楼地板");
    }
}
