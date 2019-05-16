package com.example.designpatter.observer.self;

public interface Observer {
    void onUpdate(float temperature, float humidity, float pressure);
}
