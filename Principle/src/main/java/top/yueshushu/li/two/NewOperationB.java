package top.yueshushu.li.two;

import top.yueshushu.li.one.OperationA;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class NewOperationB implements BaseOperation{
    private NewOperationA operationA = new NewOperationA();

    public int oldSub(int a, int b) {
        // 对方法进行了改变, 无意重写。 如果不重写的话，当 operationA.sub 方法变化时，所有的子类都会变化。
        return operationA.sub(a,b);
    }

    public int sub(int a, int b) {
       // 对其重写的
        return a+b;
    }

    public int div( int a, int b) {
        return a /b;
    }
}
