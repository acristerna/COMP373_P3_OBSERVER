package Observer;

import State.Update;
import ConcreteObservers.BandSubscriber1;
import ConcreteObservers.BandSubscriber2;
import ConcreteObservers.BandSubscriber3;


public interface Observer 
{
    public void update(Update u);
}