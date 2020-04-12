package ConcreteObservers;

import Observer.Observer;
import State.Update;


public class BandSubscriber1 implements Observer 
{
    @Override
    public void update(Update u) {
        System.out.println("BandSubscriber1 Notification: " + u.getUpdateContent());
    }
}