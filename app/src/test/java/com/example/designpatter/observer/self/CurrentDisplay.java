package com.example.designpatter.observer.self;

public class CurrentDisplay implements Observer, DisplayElement{

    private final WeatherData WeatherData;

    private float temperature;
    private float humidity;
    private float pressure;

    CurrentDisplay(WeatherData weatherData) {
        this.WeatherData = weatherData;
        this.WeatherData.addObserver(this);
    }

    @Override
    public void onUpdate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("当前屏幕" + temperature + " " + humidity + " " + pressure);
    }
}
