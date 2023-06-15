package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class ChainTest {

    @Test
    public void oneTest() {
        // 定义责任链用户
        Approver zhuRen = new ZhuRen("主任");
        Approver yuanZhang = new YuanZhang("院长");
        Approver fuXiaoZhang = new FuXiaoZhange("副校长");
        Approver xiaoZhange = new XiaoZhange("校长");

        zhuRen.setNext(yuanZhang);
        yuanZhang.setNext(fuXiaoZhang);
        fuXiaoZhang.setNext(xiaoZhange);

        // 定义一个请求
        BuyAudit buyAudit = new BuyAudit();
        buyAudit.setId(1);
        buyAudit.setPrice(15000.0f);
        log.info(">>> 处理 15000 的请求申请");
        //从最低的开始进行处理请求
        zhuRen.processRequest(buyAudit);
        buyAudit.setPrice(45000.0f);
        log.info(">>> 处理 45000 的请求申请");
        zhuRen.processRequest(buyAudit);
    }
}
