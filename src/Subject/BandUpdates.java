package Subject;

import Observer.Observer;
import State.Update;

public interface BandUpdates 
{
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyUpdate(Update u);
}