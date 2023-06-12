package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class TeacherProxy implements ITeacher{
    private ITeacher iTeacher ;

    public TeacherProxy (ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    @Override
    public void talk() {
        log.info("老师提前备课--> 用户 prepare 操作");
        iTeacher.talk();
        log.info("老师课后总结--> 用户 after 操作");
    }

}
