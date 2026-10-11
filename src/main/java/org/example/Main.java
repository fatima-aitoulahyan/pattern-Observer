package org.example;

import org.example.obs.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(new Observer() {
            @Override
            public void update(int newState) {
                System.out.println("************ Observer 3*****************");
                System.out.println("New state = "+newState);
            }
        });
        observable.subscribe(newState -> {
            System.out.println("************ Observer 4*****************");
            System.out.println("New state = "+newState);
        });

        observable.setState(3);
        observable.setState(79);
    }
}
