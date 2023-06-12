package top.yueshushu.reversal.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class Message {
    public void send(Email email) {
        String info = email.getInfo();
        log.info(">>> 获取邮件信息，并进行发送 {}", info);
    }

    public void send(WeiXin weiXin) {
        String info = weiXin.getInfo();
        log.info(">>> 获取微信信息，并进行发送 {}", info);
    }
}
