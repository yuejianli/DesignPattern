package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.DownPhone;
import top.yueshushu.one.Phone;
import top.yueshushu.one.UpPhone;
import top.yueshushu.one.XiaoMiBrand;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class BrandTest {

    @Test
    public void oneTest() {
        Phone phone = new UpPhone(new XiaoMiBrand());
        phone.open();
        phone.close();

        phone = new DownPhone(new XiaoMiBrand());

        phone.sendMessage();
        phone.call();
    }
}
