package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }

    }
}
