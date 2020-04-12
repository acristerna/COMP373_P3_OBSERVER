package ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;
import State.Update;
import Subject.BandUpdates;
 
public class BandUpdatesWebFeed implements BandUpdates {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void add(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Update u) {
        for(Observer o: observers) {
            o.update(u);
        }
    }
}
