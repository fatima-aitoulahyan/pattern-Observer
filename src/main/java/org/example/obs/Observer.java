package org.example.obs;
@FunctionalInterface
public interface Observer {
    //méthode Push
    //void update(int newState);
    //méthode Pop
    void update(Observable o);
}
