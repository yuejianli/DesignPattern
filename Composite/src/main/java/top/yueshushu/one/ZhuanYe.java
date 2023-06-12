package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class ZhuanYe  extends OrgComponent{

    public ZhuanYe(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>{}",getName());
    }
}
