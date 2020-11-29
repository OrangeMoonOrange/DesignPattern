package Observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/28 21:26
 * @Desc: event类是少不了的
 */

/**
 * 1)很多时候需要，观察者需要根据事件的具体情况来进行处理，事件本身也是有体系的，不同类进行继承
 * 2)大多数时候，我们处理事件的时候，需要事件源对象
 * 3)但是观察者 可以观察很多对象，所以观察者不能和要观察的对象绑定：也就是观察者只和事件打交道不和事件源打交道
 * 4)event将观察者和被观察者进行解耦；
 * 5)很多系统中observer模式往往和责任链模式共同负责对事件的处理，其中observer负责是否将事件进一步传递
 * 总结：observer listener hook callback function 本质就是观察者模式
 */
public class child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
    }

    public void wakeUp() {
        cry = true;
        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (Observer observer : observers) {
            observer.WakeUpAction(event);
        }
    }

}

//事件体系
abstract class Event<T> {
    abstract T getSource();
}

//小孩醒的事件
class wakeUpEvent extends Event<child> {
    long timestamp;//事件发生的事件
    String loc;//事件发生的位置
    child source;//事件源对象

    public wakeUpEvent(long timestamp, String loc, child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    child getSource() {
        return source;
    }
}

interface Observer {
    void WakeUpAction(wakeUpEvent event);
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad is feed");
    }


    @Override
    public void WakeUpAction(wakeUpEvent event) {
        feed();
    }
}

class Mom implements Observer {
    public void cache() {
        System.out.println("mom is cache");

    }


    @Override
    public void WakeUpAction(wakeUpEvent event) {
        cache();
    }
}
