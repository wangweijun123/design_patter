package com.example.designpatter.observer.self;

public class Test {
    @org.junit.Test
    public void testObserver() {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(1.0f, 2.0f, 3.0f);

        weatherData.deleteObserver(currentDisplay);
        weatherData.setMeasurements(4.0f, 5.0f, 6.0f);
    }
}
