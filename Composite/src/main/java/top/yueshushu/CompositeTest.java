package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.DaXue;
import top.yueshushu.one.OrgComponent;
import top.yueshushu.one.XueYuan;
import top.yueshushu.one.ZhuanYe;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class CompositeTest {

    @Test
    public void oneTest() {
        OrgComponent daXue = new DaXue("大学","大学1");

        OrgComponent xueYuan1 = new XueYuan("学院1","学院1");
        OrgComponent xueYuan2 = new XueYuan("学院2","学院2");

        daXue.add(xueYuan1);
        daXue.add(xueYuan2);

        // 添加专业

        OrgComponent zhuanYe1 = new ZhuanYe("专业1","专业1");
        OrgComponent zhuanYe2 = new ZhuanYe("专业2","专业2");
        OrgComponent zhuanYe3 = new ZhuanYe("专业3","专业3");
        OrgComponent zhuanYe4 = new ZhuanYe("专业4","专业4");


        xueYuan1.add(zhuanYe1);
        xueYuan1.add(zhuanYe2);
        xueYuan2.add(zhuanYe3);
        xueYuan2.add(zhuanYe4);

        log.info(">>>>> 移除之前 大学打印: ");
        // 进行打印
        daXue.print();
        log.info(">>>>> 移除之前 学院打印: ");
        xueYuan1.print();

//        xueYuan1.remove( zhuanYe1);
//
//        log.info(">>>>> 移除之后打印: ");
//
//        daXue.print();
//        xueYuan1.print();


    }
}
