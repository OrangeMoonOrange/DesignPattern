package Observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/28 21:26
 * @Desc: event类是少不了的
 */

/**
 * 很多时候需要，观察者需要根据事件的具体情况来进行处理，事件本身也是有体系的，不同类进行继承
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 但是观察者 可以观察很多对象，所以观察者不能和要观察的对象绑定：也就是观察者只和事件打交道不和事件源打交道
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


//小孩醒的事件
class wakeUpEvent {
    long timestamp;//事件发生的事件
    String loc;//事件发生的位置
    child source;//事件源对象

    public wakeUpEvent(long timestamp, String loc, child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
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
