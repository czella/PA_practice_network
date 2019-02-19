package com.coodecool.network;

import java.util.LinkedList;
import java.util.List;

public class Network {

    private List<Device> devices = new LinkedList<>();
    private List<ConnectedDevice> connectedDevices = new LinkedList<>();
    private List<NormalDevice> normalDevices = new LinkedList<>();
    private List<SmartDevice> smartDevices = new LinkedList<>();


    public Network() {

        createDevices();
        createSimulation();
    }

    private void createDevices() {

        for (int i = 0; i < 4; i++) {

            ConnectedDevice connectedDevice = new ConnectedDevice(1,10);
            connectedDevices.add(connectedDevice);
            devices.add(connectedDevice);
        }

        SmartDevice smartDevice1 = new SmartDevice(0,3,"Phone",Screen.FULL_HD);
        devices.add(smartDevice1);
        smartDevices.add(smartDevice1);
        SmartDevice smartDevice2 = new SmartDevice(1,500,"Tablet",Screen.UHD);
        devices.add(smartDevice2);
        smartDevices.add(smartDevice2);

        NormalDevice normalDevice1 = new NormalDevice(3,12,2015,Screen.EDTV);
        devices.add(normalDevice1);
        normalDevices.add(normalDevice1);
        NormalDevice normalDevice2 = new NormalDevice(8,10,2011,Screen.HD);
        devices.add(normalDevice2);
        normalDevices.add(normalDevice2);

    }

    private void createSimulation() {

        new SimulationLoop(this);
    }

    public List<ConnectedDevice> getConnectedDevices() {
        return connectedDevices;
    }

    public List<NormalDevice> getNormalDevices() {
        return normalDevices;
    }

    public List<SmartDevice> getSmartDevices() {
        return smartDevices;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
