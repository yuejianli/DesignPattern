package top.yueshushu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.yueshushu.one.*;
import top.yueshushu.two.NewUser;
import top.yueshushu.two.NewWeatherDataSubject;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class ObserverTest {

    @Test
    public void oneTest() {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        weatherDataSubject.registerObserver(new BaiDu());
        weatherDataSubject.registerObserver(new Sina());

        // 设置数据
        weatherDataSubject.setWeather(
                Weather.builder()
                        .temperature(35.0f)
                        .pressure(20.0f)
                        .humidity(30.f)
                        .build()
        );
        User user = new User();
        // 再添加个数据
        weatherDataSubject.registerObserver(user);

        weatherDataSubject.setWeather(
                Weather.builder()
                        .temperature(30.0f)
                        .pressure(21.0f)
                        .humidity(32.f)
                        .build()
        );


        weatherDataSubject.remove(user);


        weatherDataSubject.setWeather(
                Weather.builder()
                        .temperature(32.0f)
                        .pressure(22.0f)
                        .humidity(33.f)
                        .build()
        );

    }

    @Test
    public void twoTest() {
        Weather weather = Weather.builder()
                .temperature(32.0f)
                .pressure(22.0f)
                .humidity(33.f)
                .build();
        NewWeatherDataSubject newWeatherDataSubject = new NewWeatherDataSubject(weather);
        newWeatherDataSubject.addObserver(new NewUser("用户1"));
        newWeatherDataSubject.addObserver(new NewUser("用户2"));
        newWeatherDataSubject.addObserver(new NewUser("用户3"));
        log.info("温度发生改变");
        weather.setTemperature(34.f);
        newWeatherDataSubject.setWeather(weather);
        log.info("温度再次发生改变");
        weather.setTemperature(30.f);
        newWeatherDataSubject.setWeather(weather);
    }
}
