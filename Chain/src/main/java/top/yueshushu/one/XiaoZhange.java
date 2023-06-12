package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class XiaoZhange extends Approver{
    public XiaoZhange(String name) {
        super(name);
    }
    @Override
    public void processRequest(BuyAudit buyAudit) {
        log.info("请求{} 金额是 {} 被用户 {} 处理", buyAudit.getId(),buyAudit.getPrice(),this.getName());
    }
}
