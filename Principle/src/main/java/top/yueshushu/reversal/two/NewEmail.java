package top.yueshushu.reversal.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class NewEmail implements SendMessage{

    @Override
    public String getInfo() {
        return "构建邮件信息，并进行发送";
    }
}
