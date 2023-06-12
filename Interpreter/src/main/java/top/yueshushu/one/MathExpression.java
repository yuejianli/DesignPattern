package top.yueshushu.one;

import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public abstract class MathExpression {
    /**
     处理表达式
     * @param paramMap
     */
    public abstract int interpreter (Map<String, Integer> paramMap);
}
