package top.yueshushu.one;

import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public class SubExpression extends BaseMathExpression{

    public SubExpression(MathExpression left, MathExpression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> paramMap) {
        return super.getLeft().interpreter(paramMap) - super.getRight().interpreter(paramMap);
    }
}
