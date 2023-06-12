package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-06-05
 */

public class CalcStrategyContext {

    private CalcStrategy calcStrategy;
    public CalcStrategyContext (CalcStrategy calcStrategy) {
        this.calcStrategy = calcStrategy;
    }

    public void setCalcStrategy(CalcStrategy calcStrategy) {
        this.calcStrategy = calcStrategy;
    }

    // 定义原先的方法

    public int calc(int num1, int num2) {
        return this.calcStrategy.calc(num1,num2);
    }
}
