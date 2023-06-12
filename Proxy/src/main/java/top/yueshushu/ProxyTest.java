package top.yueshushu;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.Aspect;
import cn.hutool.aop.aspects.SimpleAspect;
import cn.hutool.aop.proxy.JdkProxyFactory;
import cn.hutool.aop.proxy.ProxyFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.RealTeacher;
import top.yueshushu.one.TeacherProxy;
import top.yueshushu.three.RealTeacher3;
import top.yueshushu.three.TeacherProxy3;
import top.yueshushu.two.ITeacher2;
import top.yueshushu.two.RealTeacher2;
import top.yueshushu.two.TeacherProxy2;

import java.lang.reflect.Method;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class ProxyTest {

    @Test
    public void oneTest() {
        RealTeacher realTeacher = new RealTeacher();
        TeacherProxy teacherProxy = new TeacherProxy(realTeacher);
        teacherProxy.talk();
    }

    @Test
    public void twoTest() {
        ITeacher2 teacher2 = new RealTeacher2();
        // 处理转换代理信息
        ITeacher2 target = (ITeacher2)(new TeacherProxy2(teacher2).getProxyInstance());
        // 进行处理
        target.hello("张三");
    }

    @Test
    public void threeTest() {
        RealTeacher3 realTeacher3 = new RealTeacher3();
        // 处理转换代理信息
        RealTeacher3 target = (RealTeacher3)new TeacherProxy3(realTeacher3).getProxyInstance();
        // 进行处理
        target.hello("张三");
    }

    @Test
    public void fourTest() {
        ITeacher2 teacher2 = new RealTeacher2();


        ITeacher2 proxy = ProxyUtil.proxy(teacher2, new SimpleAspect());

        proxy.hello("JDK动态代理");

        ITeacher2 proxy2 = ProxyFactory.createProxy(teacher2, new Aspect() {
            @Override
            public boolean before(Object target, Method method, Object[] args) {
                return false;
            }

            @Override
            public boolean after(Object target, Method method, Object[] args, Object returnVal) {
                return false;
            }

            @Override
            public boolean afterException(Object target, Method method, Object[] args, Throwable e) {
                return false;
            }
        });
        proxy2.hello("JDK 动态代理22");
    }
}
