package top.yueshushu.one;

import java.util.Map;
import java.util.Stack;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */

public class MathCalculator {

    private MathExpression mathExpression;

    /**
    构造方法传入一个表达式
     */
    public MathCalculator (String expStr) {
   // 安排运算先后顺序
        Stack<MathExpression> stack = new Stack<>();
        // 表达式拆分成字符数组
        // 进行拆分
        char[] charArray = expStr.toCharArray();
        MathExpression left = null;
        MathExpression right = null;
        //遍历我们的字符数组， 即遍历  [a, +, b]
        //针对不同的情况，做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':{
                    left = stack.pop();// 从stack取出left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i]));// 取出右表达式 "b"
                    stack.push(new AddExpression(left, right));// 然后根据得到left 和 right 构建 AddExpresson加入stack
                    break;
                }
                case '-':{
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                }
                default:{
                    //如果是一个 Var 就创建要给 VarMathExpression 对象，并push到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
                }
            }
        }
        //当遍历完整个 charArray 数组后，stack 就得到最后MathExpression
        this.mathExpression = stack.pop();


    }
    /**
     对外提供的一个方法， 用于获取结果
     */
    public int exec (Map<String,Integer> paramMap) {
        return this.mathExpression.interpreter(paramMap);
    }


}
