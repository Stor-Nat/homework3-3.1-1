package ru.netology;

public class Conditioner {
    public int temperature;
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncreaseCurrentTemperature() {
        return currentTemperature;
    }

    public void setIncreaseCurrentTemperature(int currentTemperature) {
        maxTemperature = 30;
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature = currentTemperature + 1;
        this.currentTemperature = currentTemperature;
    }


    public int getDecreaseCurrentTemperature() {
        return currentTemperature;
    }

    public void setDecreaseCurrentTemperature(int currentTemperature) {
        minTemperature = 20;
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature = currentTemperature - 1;
        this.currentTemperature = currentTemperature;
    }
}
