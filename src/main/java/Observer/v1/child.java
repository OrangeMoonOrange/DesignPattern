package Observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/28 21:26
 * @Desc:
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
        for (Observer observer : observers) {
            observer.WakeUpAction();
        }
    }

}

interface Observer {
    void WakeUpAction();
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad is feed");
    }

    @Override
    public void WakeUpAction() {
        feed();
    }
}

class Mom implements Observer {
    public void cache() {
        System.out.println("mom is cache");

    }

    @Override
    public void WakeUpAction() {
        cache();
    }
}
