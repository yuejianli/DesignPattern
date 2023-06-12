package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class YuanZhang extends Approver{
    public YuanZhang(String name) {
        super(name);
    }
    @Override
    public void processRequest(BuyAudit buyAudit) {
        if (buyAudit.getPrice() < 10000) {
            log.info("请求{} 金额是 {} 被用户 {} 处理", buyAudit.getId(),buyAudit.getPrice(),this.getName());
        }else {
            // 交给下一个人进行处理
            log.info("用户 {} 无法处理这么大的金额申请，往上抛出 ", this.getName());
            super.getNext().processRequest(buyAudit);
        }
    }
}
