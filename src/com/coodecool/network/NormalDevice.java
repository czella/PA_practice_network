package com.coodecool.network;

public class NormalDevice extends Device {

    private Integer yearOfManufacture;
    private Screen screenSize;
    public NormalDevice(Integer age, Integer batteryLife, Integer yearOfManufacture, Screen screenSize) {
        super(age, batteryLife);
        this.yearOfManufacture = yearOfManufacture;
        this.screenSize = screenSize;

    }

    @Override
    void age() {
        age++;
        batteryLife -= 3;
        if (yearOfManufacture > 2000) {
            batteryLife = batteryLife * 2;
        } else {
            batteryLife = batteryLife / 2;
        }
        printRemainingPower();

    }
}
