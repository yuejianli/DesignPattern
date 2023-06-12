package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Colleague;
import top.yueshushu.one.ConcreteMediator;
import top.yueshushu.one.PhoneColleague;
import top.yueshushu.one.TVColleague;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class MediatorTest {

    @Test
    public void oneTest(){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague tv1 = new TVColleague("tv1",concreteMediator);

        Colleague phone1 = new PhoneColleague("ph1",concreteMediator);
        Colleague phone2 = new PhoneColleague("ph2",concreteMediator);

        // 发送指令
        tv1.sendCmd("on");
        phone1.sendCmd("wx");
        phone2.sendCmd("call");
    }
}
