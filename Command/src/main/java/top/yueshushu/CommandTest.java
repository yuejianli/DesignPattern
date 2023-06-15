package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class CommandTest {

    @Test
    public void oneTest() {

        LightCommandReceiver lightCommandReceiver = new LightCommandReceiver();

        Command lightOn = new LightOn(lightCommandReceiver);

        RemoteSend remoteSend = new RemoteSend(lightOn);
        remoteSend.execute();
        remoteSend.undo();

        Command lightOff = new LightOff(lightCommandReceiver);
        remoteSend = new RemoteSend(lightOff);
        remoteSend.execute();
        remoteSend.undo();
    }
}
