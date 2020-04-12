package Main;

import ConcreteObservers.BandSubscriber1;
import ConcreteObservers.BandSubscriber2;
import ConcreteObservers.BandSubscriber3;
import ConcreteSubject.BandUpdatesWebFeed;
import State.Update;

public class Main 
{
    public static void main(String[] args) 
    {
        BandSubscriber1 s1 = new BandSubscriber1();
        BandSubscriber2 s2 = new BandSubscriber2();
        BandSubscriber3 s3 = new BandSubscriber3();
         
        BandUpdatesWebFeed webFeed = new BandUpdatesWebFeed();
         
        webFeed.add(s1);
        webFeed.add(s2);
         
        webFeed.notifyUpdate(new Update("World Tour Dates Announced!"));   //Band Subscribers 1 and 2 will receive the update
         
        webFeed.remove(s1);
        webFeed.add(s3);
         
        webFeed.notifyUpdate(new Update("Pre-sale Tickets Available for Long-time Subscribers! Click Here!")); //Band Subscribers 2 and 3 will receive the update
    }
}
