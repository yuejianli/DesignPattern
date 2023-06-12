package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class NoMilk extends Milk{
    @Override
    protected boolean customerCondiments() {
        return false;
    }

    @Override
    protected void addCondiments() {

    }
}
