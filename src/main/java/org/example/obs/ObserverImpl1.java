package org.example.obs;

public class ObserverImpl1 implements Observer {
    //méthode Pop
    @Override
    public void update(Observable o) {
        if(o instanceof ObservableImpl){
            System.out.println("******Observer1*******");
            System.out.println("new State "+ ((ObservableImpl) o).getState());
        }


    }
    // méthode Push
   /* @Override
    public void update(int newState) {
        System.out.println("******Observer1*******");
        System.out.println("new State "+ newState);
    }*/

}
