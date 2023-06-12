package top.yueshushu.li.one;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-23
 */

public class OperationB extends OperationA{

    @Override
    public int sub(int a, int b) {
       // 对方法进行了改变, 无意重写。 如果不重写的话，当 operationA.sub 方法变化时，所有的子类都会变化。
        return a + b;
    }

    public int div( int a, int b) {
        return a /b;
    }
}
