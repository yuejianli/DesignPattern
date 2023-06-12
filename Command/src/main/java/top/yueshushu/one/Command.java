package top.yueshushu.one;

/**
  命令
 *
 * @author Yue Jianli
 * @date 2023-05-29
 */

public interface Command {
    /**
     执行命令
     */
    public void execute();
    /**
     撤销命令
     */
    public void undo();
}
