工厂方法模式


#  优点

在新增一个种类实现时， 只需要创建对应的工厂类就可以了，不需要改动现在的代码，扩展性比较好。

![img.png](img.png)


如果要增加一个中国的，只需要 增加 ChineseAbsOrderPizzaFactoryFactory  类

和对应的 中国Pizza 实现即可

但不支持 产品族


