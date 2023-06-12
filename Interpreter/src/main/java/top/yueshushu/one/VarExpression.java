package top.yueshushu.one;


import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public class VarExpression extends MathExpression {
    private String key;
    public VarExpression (String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> paramMap) {
        return paramMap.get(key);
    }
}
