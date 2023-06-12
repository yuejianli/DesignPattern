package top.yueshushu.one;

/**
 * TODO 用途描述
 *
 * @author Yue Jianli
 * @date 2023-05-30
 */

public interface Subject {
    public void registerObserver(Observer observer);

    public void remove (Observer observer);

    public void notifyObservers();
}
