package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    //méthode Pop

    @Override
    public void update(Observable o) {
        if(o instanceof ObservableImpl){
            history.add(((ObservableImpl) o).getState());
            double sum=0;
            for (int i=0 ; i<history.size();i++){
                sum=sum+history.get(i);
            }
            System.out.println("******Observer 2*******");

            System.out.println("Moyenne = "+sum/history.size());
        }

    }
    //méthode Push
   /* @Override
    public void update(int newState) {
        history.add(newState);
        double sum=0;
        for (int i=0 ; i<history.size();i++){
            sum=sum+history.get(i);
        }
        System.out.println("******Observer 2*******");

        System.out.println("Moyenne = "+sum/history.size());
    }*/
}
