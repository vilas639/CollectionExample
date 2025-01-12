package com.ashokit.senariobased.oops;

import java.util.ArrayList;
import java.util.List;

/*
 How would you implement a notification system with multiple observers?
Answer:

Use the Observer Pattern:

 */
public class ObservalExample {

    public static void main(String[] args) {
        NotificationService n= new NotificationService();
        n.notifyAllObservers("welcome");
    }
}

 interface Observer {
    void update(String message);
}

 class EmailNotifier implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}

 class SMSNotifier implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

 class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}


