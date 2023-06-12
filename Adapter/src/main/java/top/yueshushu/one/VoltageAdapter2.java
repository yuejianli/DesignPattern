package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 类适配器
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class VoltageAdapter2 implements IVoltage5V{
    private Voltage220V voltage220V ;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        // 获取电压
        int srcV = voltage220V.output220V();
        // 转换成 5V
        int dstV = srcV /44;
        return dstV;
    }
}
