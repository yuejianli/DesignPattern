package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-26
 */
@Slf4j
public class SimpleHouse extends AbstractHouse{
    @Override
    protected void buildBasic() {
        log.info("简单楼打地基");
    }

    @Override
    protected void buildWalls() {
        log.info("简单楼砌墙壁");
    }

    @Override
    protected void buildRoofed() {
        log.info("简单楼地板");
    }
}
