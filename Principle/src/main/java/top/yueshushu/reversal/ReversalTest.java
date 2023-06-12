package top.yueshushu.reversal;

import org.junit.Test;
import top.yueshushu.reversal.one.Email;
import top.yueshushu.reversal.one.Message;
import top.yueshushu.reversal.one.WeiXin;
import top.yueshushu.reversal.two.NewEmail;
import top.yueshushu.reversal.two.NewMessage;
import top.yueshushu.reversal.two.NewWeiXin;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class ReversalTest {

    @Test
    public void sendOneTest() {
        Message message = new Message();
        message.send(new Email());
        message.send(new WeiXin());
    }

    /**
    将消息提取成一个接口，  然后邮箱 和微信进行实现。
     */
    @Test
    public void sendTwoTest() {
        NewMessage message = new NewMessage();
        message.send(new NewEmail());
        message.send(new NewWeiXin());
    }
}
