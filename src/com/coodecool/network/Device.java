package com.coodecool.network;

public abstract class Device {

    protected Integer age;
    protected Integer batteryLife;

    public Device(Integer age, Integer batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
    }



    public Integer getReaminingPower() {
        return batteryLife - age;
    }

    public void printRemainingPower() {

        System.out.println(getClass().getSimpleName() + "{" +
                "remainingPower: " + getReaminingPower() +
                "}");
    }

    abstract void age();

    @Override
    public String toString() {
        return  getClass().getSimpleName()  + "{" +
                "age=" + age +
                ", batteryLife=" + batteryLife +
                '}';
    }

    public void checkIsAlive() {
        if (getReaminingPower() <= 0) {
            System.out.println(this + "Imded");
        }
    }
}
