package com.example.designpatter.observer.self;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    ForecastDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("远程显示" + temperature + " " + humidity + " " + pressure);
    }

    @Override
    public void onUpdate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
