package top.yueshushu.li;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.li.one.OperationA;
import top.yueshushu.li.one.OperationB;
import top.yueshushu.li.two.NewOperationA;
import top.yueshushu.li.two.NewOperationB;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */
@Slf4j
public class LiTest {

    @Test
    public void testOne() {
        OperationA operationA = new OperationA();
        log.info("3-1={}",operationA.sub(3,1));

        OperationB operationB = new OperationB();
        log.info("3-1={}",operationB.sub(3,1));
        log.info("3/1={}",operationB.div(3,1));
    }

    /**
     同时继承一个 BaseOperation 类， 表示接口的能力进行处理。
     */
    @Test
    public void testTwo() {
        NewOperationA operationA = new NewOperationA();
        log.info("3-1={}",operationA.sub(3,1));

        NewOperationB operationB = new NewOperationB();
        log.info("3+1={}",operationB.sub(3,1));
        log.info("3-1={}",operationB.oldSub(3,1));
        log.info("3/1={}",operationB.div(3,1));
    }
}
