package top.yueshushu.one;

import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public class BaseMathExpression extends MathExpression{

    private MathExpression left;
    private MathExpression right;

    public BaseMathExpression (MathExpression left, MathExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> paramMap) {
        // 是个空方法，让子类进行重写.
        return 0;
    }

    public MathExpression getLeft() {
        return left;
    }

    public MathExpression getRight() {
        return right;
    }
}
