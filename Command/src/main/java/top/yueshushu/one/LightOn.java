package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class LightOn implements Command{

    private LightCommandReceiver lightCommandReceiver;

    public LightOn( LightCommandReceiver lightCommandReceiver) {
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        lightCommandReceiver.on();
    }

    @Override
    public void undo() {
        lightCommandReceiver.off();
    }
}
