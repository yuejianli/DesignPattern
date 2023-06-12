package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.Caretaker;
import top.yueshushu.one.GameRole;
import top.yueshushu.one.Memento;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class MementoTest {

    @Test
    public void oneTest() {

        GameRole gameRole = new GameRole();
        gameRole.setVit(0);
        gameRole.setDef(0);
        gameRole.setBlood(100);

        log.info(">>> 打之前的数据是: ");
        gameRole.display();


        Memento memento = gameRole.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.saveStatus("start",memento);


        gameRole.setVit(20);
        gameRole.setDef(20);
        gameRole.setBlood(50);
        log.info(">>> 打一半的数据是: ");
        gameRole.display();
        // 存个档
        caretaker.saveStatus("middle",gameRole.createMemento());
        // 回退到开始的版本

        gameRole.recoverFromMemento(caretaker.getByStatus("start"));

        gameRole.setVit(20);
        gameRole.setDef(0);
        gameRole.setBlood(0);
        log.info(">>> 最后的数据是: ");
        gameRole.display();
        // 存个档
        caretaker.saveStatus("end",gameRole.createMemento());



        log.info(">>> 回退到开始的版本: ");
        gameRole.display();
    }
}
