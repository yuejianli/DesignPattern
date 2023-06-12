package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.User;
import top.yueshushu.one.WebSite;
import top.yueshushu.one.WebSiteFactory;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class FlyweightTest {

    @Test
    public void oneTest (){
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite xinwen = webSiteFactory.getType("新闻");
        xinwen.use(new User("zhangsan"));

        // 定义的是不变的。
        WebSite weblog = webSiteFactory.getType("weblog");
        weblog.use(new User("zhangsan"));

        WebSite weblog2 = webSiteFactory.getType("weblog");
        weblog2.use(new User("lisi"));
    }
    @Test
    public void twoTest() {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        for (int i = 0 ;i <100 ;i++) {
            WebSite webLog = webSiteFactory.getType("webLog");
            webLog.use(new User(i+""));
            log.info("信息:{}",webLog.hashCode());
        }
    }
}
