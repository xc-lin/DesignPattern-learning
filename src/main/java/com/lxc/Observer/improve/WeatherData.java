package com.lxc.Observer.improve;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }



    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
