package com.example.designpatter.observer.self;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}
