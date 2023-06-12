package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class ConcreteWebSite extends WebSite{
    // 共享的，是内部的, 是不变的。
    private String type = "";

    public ConcreteWebSite (String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        log.info(" 发布类型是: {}, 使用者是: {}", type,user);
    }
}
