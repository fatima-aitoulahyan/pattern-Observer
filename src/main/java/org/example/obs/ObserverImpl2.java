package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    @Override
    public void update(int newState) {
        history.add(newState);
        System.out.println("*************");
    }
}
