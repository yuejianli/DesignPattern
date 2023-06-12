package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class Sina implements Observer{
    private Weather weather ;
    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }

    public void display (){
        if (weather == null) {
            return ;
        }
        log.info(">>>>>>>>>>>>>新浪网站获取到天气数据,进行个性化操作");
        log.info(">>>温度: {}, 气压: {}, 湿度: {}", weather.getTemperature(),weather.getPressure(),
                weather.getHumidity());
    }

}
