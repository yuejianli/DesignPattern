package top.yueshushu.one;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途描述
 *
 * @author yuejianli
 * @date 2023-05-30
 */
@Slf4j
public class WeatherDataSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private Weather weather;
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.weather);
        }
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        dataChange();
    }

    public void dataChange() {
        // 更新后，数据发生了改变。
        log.info("获取到了最新的数据: {}", this.weather);
        notifyObservers();
    }
}
