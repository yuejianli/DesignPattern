package top.yueshushu.one;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-29
 */
@Slf4j
@Data
public class Phone {
    private String name;

    public void charge(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            log.info("电压是 5V, 可以进行充电");
        }else {
            log.info("电压是: {}, 不能充电", iVoltage5V.output5V());
        }
    }

    public void chargeOld( Voltage220V voltage220V) {
        if (voltage220V.output220V() == 220) {
            log.info("电压是 220, 可以进行充电");
        }else {
            log.info("电压是: {}, 不能充电", voltage220V.output220V());
        }
    }
}
