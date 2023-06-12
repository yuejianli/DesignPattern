package top.yueshushu.reversal.two;

import lombok.extern.slf4j.Slf4j;
import top.yueshushu.reversal.one.Email;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class NewMessage {
    public void send(SendMessage sendMessage) {
        String info = sendMessage.getInfo();
        log.info(">>> 发送 {}", info);
    }
}
