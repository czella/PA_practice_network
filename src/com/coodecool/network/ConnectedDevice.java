package com.coodecool.network;

import java.util.LinkedList;
import java.util.List;

public class ConnectedDevice extends Device {

    private static List<ConnectedDevice> connectedDevs = new LinkedList<>();
    public ConnectedDevice(Integer age, Integer batteryLife) {
        super(age, batteryLife);
        connectedDevs.add(this);
    }

    @Override
    void age() {
        age ++;
        batteryLife -= 7;
        batteryLife += connectedDevs.size() * 20;
        printRemainingPower();
    }
}
