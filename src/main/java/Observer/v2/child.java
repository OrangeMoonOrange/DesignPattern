package Observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/28 21:26
 * @Desc: event类是少不了的
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
        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed");
        for (Observer observer : observers) {
            observer.WakeUpAction(event);
        }
    }

}


//小孩醒的事件
class wakeUpEvent {
    long timestamp;//事件发生的事件
    String loc;//事件发生的位置

    public wakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
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
