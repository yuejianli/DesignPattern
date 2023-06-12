package top.yueshushu.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public interface  Mediator {

    void register (String name, Colleague colleague) ;

    void getCmdMessage (String name, String cmd);

}
