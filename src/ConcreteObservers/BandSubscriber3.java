package ConcreteObservers;

import Observer.Observer;
import State.Update;

public class BandSubscriber3 implements Observer 
{
    @Override
    public void update(Update u) {
        System.out.println("BandSubscriber3 Notification: " + u.getUpdateContent());
    }
}