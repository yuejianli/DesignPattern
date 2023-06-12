package top.yueshushu.three;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class TeacherProxy3 implements MethodInterceptor {
    private Object target;
    public TeacherProxy3(Object target) {
        this.target = target;
    }

    public Object getProxyInstance () {
        // 创建工具类 Enhancer
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数, 主要是这个。
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("CGLIB 代理开始");

        Object returnVal = methodProxy.invoke(target, objects);

        log.info("CGLIB 代理结束");
        return returnVal;
    }

}
