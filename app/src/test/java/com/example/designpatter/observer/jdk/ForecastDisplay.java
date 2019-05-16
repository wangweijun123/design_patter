package com.example.designpatter.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float humidity = weatherData.getHumidity();
            System.out.println("远程屏幕收到通知 " + humidity);
        }
    }
}
