package ConcreteObservers;

import Observer.Observer;
import State.Update;

public class BandSubscriber2 implements Observer 
{
    @Override
    public void update(Update u) {
        System.out.println("BandSubscriber2 Notification: " + u.getUpdateContent());
    }
}