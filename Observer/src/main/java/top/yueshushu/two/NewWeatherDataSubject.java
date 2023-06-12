package top.yueshushu.two;

import top.yueshushu.one.Weather;

import java.util.Observable;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */

public class NewWeatherDataSubject extends Observable {
    private Weather weather;

    public NewWeatherDataSubject (Weather weather) {
        this.weather = weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        // 改变了
        super.setChanged();
        super.notifyObservers(weather);
    }
}
