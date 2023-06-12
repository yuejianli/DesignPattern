package top.yueshushu.one;

/**
 * TODO 用途描述
 *
 * @author Yue Jianli
 * @date 2023-05-30
 */

public interface Aggregate<T> {

    /**
     定义不同的迭代器
     */

    public MyIterator<T> getInterator();

    public MyIterator<T> getReverseInterator();


}
