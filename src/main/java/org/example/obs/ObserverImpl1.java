package org.example.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("******Observer1*******");
        System.out.println("new State "+ newState);
    }
}
