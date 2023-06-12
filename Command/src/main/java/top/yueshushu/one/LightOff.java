package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class LightOff implements Command{

    private LightCommandReceiver lightCommandReceiver;

    public LightOff(LightCommandReceiver lightCommandReceiver) {
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        lightCommandReceiver.off();
    }

    @Override
    public void undo() {
        lightCommandReceiver.on();
    }


}
