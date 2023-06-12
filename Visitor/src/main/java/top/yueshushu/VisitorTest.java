package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class VisitorTest {

    @Test
    public void oneTest() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.accept(new Man("张三"));
        // 是成功的
        objectStructure.display(new SuccessAction());

        objectStructure.remove(new Man("张三"));
        objectStructure.accept(new Man("李四"));

        objectStructure.display(new FailAction());

        objectStructure.remove(new Man("李四"));
        objectStructure.accept(new WoMan("王二"));
        objectStructure.accept(new WoMan("麻子"));

        objectStructure.display(new WaitAction());

    }
}
