package top.yueshushu.two;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-06-05
 */

public class AddStrategy implements CalcStrategy{

    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
