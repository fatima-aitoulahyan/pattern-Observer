package org.example.obs;
@FunctionalInterface
public interface Observer {
    void update(int newState);
}
