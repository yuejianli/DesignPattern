package top.yueshushu.two;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class TeacherProxy2 {

    private Object target ;

    public TeacherProxy2 (Object target) {
        this.target = target;
    }

    /**
     获取动态代理
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("JDK代理开始");

                        Object returnVal = method.invoke(target, args);

                        log.info("JDK代理结束");
                        return returnVal;
                    }
                }
        );
    }

}
