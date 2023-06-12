package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.nfunk.jep.JEP;
import top.yueshushu.one.MathCalculator;

import java.util.HashMap;
import java.util.Map;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-31
 */
@Slf4j
public class InterpreterTest {

    @Test
    public void oneTest() {
        MathCalculator mathCalculator = new MathCalculator("a+b-c+d-e");

        // 定义参数
        Map<String,Integer> paramMap = new HashMap<>();
        paramMap.put("a",1);
        paramMap.put("b",2);
        paramMap.put("c",3);
        paramMap.put("d",4);
        paramMap.put("e",5);

        int result = mathCalculator.exec(paramMap);
        log.info("最后结果是:{}",result);

    }

    @Test
    public void twoTest() {
        JEP jep = new JEP();
        // 需要先添加变量， 再处理表达式。
        jep.addVariable("a",1);
        jep.addVariable("b",2);
        jep.addVariable("c",3);
        jep.addVariable("d",4);
        jep.addVariable("e",5);
        jep.parseExpression("a+b-c+d-e");
        // 进行获取结果
        log.info(">>> 最后结果: {}", jep.getValue());
    }

}
