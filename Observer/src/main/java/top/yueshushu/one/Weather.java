package top.yueshushu.one;

import lombok.Builder;
import lombok.Data;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Data
@Builder
public class Weather {
    /**
      温度, 气压， 湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
}
