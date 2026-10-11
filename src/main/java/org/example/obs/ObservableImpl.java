package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private List<Observer> observers = new ArrayList<>();
    private int state;
    @Override
    public void subscribe(Observer o) {
        observers.add(o);

    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);

    }
    //méthode Push
    /*@Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);

        }

    }*/
    //méthode Pop
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);

        }

    }
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    public int getState() {
        return state;
    }
}
