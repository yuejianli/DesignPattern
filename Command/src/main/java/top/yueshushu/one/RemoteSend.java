package top.yueshushu.one;

/**
 * 调用者
 *
 * @author yuejianli
 * @date 2023-05-29
 */

public class RemoteSend {

    private Command command;

    public RemoteSend (Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    public void execute() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }


}
