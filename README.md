# COMP373_P3_OBSERVER

Project 3: Implementing Observer Pattern

## Inspiration 

For this real-world example of the Observer pattern, we used a simple implementation of a band's updates webfeed and its subscribers. In our implementation, the Concrete Observers is BandSubscribers, the Concrete Subject is BandUpdatesWebFeed, the State is Update, and the Subject is BandUpdates. When run, the console shows the Observer pattern is use with the notifications that can be seen by the band's subscribers.

## How To Run the Code

To run the code, clone the repository to your own development environment and run Main (in Main folder).

## What Is The Problem Identified In This Project? 

Before implementing the Observer pattern, the problem we would have faced would have been having to update each individual subscriber per notification. In the real-world this would have taken a lot of time since many band's have thousands of subscribers. 

## Solution

By implementing the Observer pattern, the band would be able to make an update and then through the pattern, the band subscribers would all be notified through the Observer interface. By implementing this pattern, it keeps the program extensible with having the ability to increase the subscriber base easily and allowing the band to notify subscribers all at once.

![](UML%20Diagram/Observer.png)

## Applications Used 

* Draw.IO (ULM Model)
* Eclipse IDE For Java 

## Credit 

Anissa Cristerna,
Henry Espinoza, and
Irfan Poljak
