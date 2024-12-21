package com.ashokit.designpattern.behaviours.observer;


import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String policyInfo);
}

// Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// PolicyManager Class (Subject)
class PolicyManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String policyUpdate;

    public void setPolicyUpdate(String policyUpdate) {
        this.policyUpdate = policyUpdate;
        notifyObservers(); // Notify all observers of the change
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(policyUpdate);
        }
    }
}

// LIC Observer
class LIC implements Observer {
    private String name = "LIC Branch";

    @Override
    public void update(String policyInfo) {
        System.out.println(name + " received policy update: " + policyInfo);
    }
}

// TATA Observer
class TATA implements Observer {
    private String name = "TATA Branch";

    @Override
    public void update(String policyInfo) {
        System.out.println(name + " received policy update: " + policyInfo);
    }
}

// Main Class (Client)
public class NewPolicyAdd {
    public static void main(String[] args) {
        // Create subject (PolicyManager)
        PolicyManager policyManager = new PolicyManager();

        // Create observers (LIC and TATA)
        LIC licBranch = new LIC();
        TATA tataBranch = new TATA();

        // Register observers
        policyManager.addObserver(licBranch);
        policyManager.addObserver(tataBranch);

        // Notify observers with policy updates
        policyManager.setPolicyUpdate("New Policy Added: Health Insurance Plan 2025");
        policyManager.setPolicyUpdate("Premium rates updated for Term Insurance Plan");
    }
}
