package com.coodecool.network;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

public class SmartDevice extends Device {

    private Screen screenSize;
    private String name;
    public SmartDevice(Integer age, Integer batteryLife, String name, Screen screenSize) {
        super(age, batteryLife);
        this.name = name;
        this.screenSize = screenSize;

    }

    public List<NormalDevice> getNormalDevicesWith(Network network, Integer powerDifference) {
        List<NormalDevice> devicesToReturn = new LinkedList<>();
        for (NormalDevice normalDev: network.getNormalDevices()
             ) {
            if (abs(normalDev.getReaminingPower() - this.getReaminingPower()) <= powerDifference) {
                devicesToReturn.add(normalDev);
            }
        }
        return devicesToReturn;
    }


    @Override
    void age() {
        age++;
        batteryLife -= 15;
        batteryLife -= screenSize.getRequiredPower();
        printRemainingPower();

    }


}
