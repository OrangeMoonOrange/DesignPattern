i ask you to judge me by the enemies i have made --Roosevelt

大部分的设计模式说到底都是多态
多态才是面对对象的核心 理解了多态才能理解面对对象的核心

开闭原则
对修改关闭，对扩展开放

面向接口编程，面向抽象编程

# 策略模式：
策略模式 封装的是做一件事的不同实现方式
    策略1：默认策略 打子弹
    策略2：四个方向同时打出子弹
    策略3：打核弹


Comparator 实现的子类，就是一种策略模式


# 工厂模式：
简单工厂
静态工厂 这基本一样

工厂方法
    a.产品维度扩展
抽象工厂
    a.铲平一族进行扩展

定义：任何可以产生对象的方法或者类，都可以称为工厂
单例也是一种工厂
不可咬文嚼字
为什么有了new之后，还要有工厂？
    灵活

抽象工厂：如何另外扩展产品族（一系列）
解释：现在人：

关于是用接口还是抽象类：形容词用接口 名词用抽象类



# 门面 Facade
解释：




# 调停者Mediator

应用 ：消息中间件


# 责任链
问题：
1）在论坛中发表文章，后台需要经过信息处理才可以发表或者进入数据库
    责任链
2）如果处理到某个filter之后，能决定下面某个filter是否要继续处理，如何实现
    返回值

公开课作业：自己完成：
    模仿
    javax.servlet.Filter
    javax.servlet.FilterChain
    完成对Request，Response 的过滤 ，Request 的顺序为 Request1、Request2、Request3 。
    对Response的过滤顺序是Response3、Response2、Response1
    思路：递归
哪部分要变就封装哪部分

# 装饰器Decorator:
**需求**：

- 坦克相加一个外壳显示
- 相加一个血条
- 相交一条尾巴
- 子弹想加...

**如果用继承：BoodTank，TailBank等，不灵活：装饰和被装饰着耦合度太高**
用聚合代替继承

![](https://kaikaimd.oss-cn-beijing.aliyuncs.com/md/image-20201128063723040.png)





IO流：

![image-20201128203039861](https://kaikaimd.oss-cn-beijing.aliyuncs.com/md/image-20201128203039861.png)





















# 观察者

![image-20201128212136555](https://kaikaimd.oss-cn-beijing.aliyuncs.com/md/image-20201128212136555.png)







