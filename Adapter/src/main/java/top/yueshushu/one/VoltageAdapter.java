package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 类适配器
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        // 获取电压
        int srcV = output220V();
        // 转换成 5V
        int dstV = srcV /44;
        return dstV;
    }
}
