package com.coodecool.network;

import java.util.List;

public class SimulationLoop {

    private Network network;
    public SimulationLoop(Network network) {
        this.network = network;
        loop();
    }

    public void loop() {

        Integer yearsPassed = 0;
        while (yearsPassed < 5) {

            network.getConnectedDevices().forEach(ConnectedDevice::age);
            network.getSmartDevices().forEach(SmartDevice::age);
            network.getNormalDevices().forEach(NormalDevice::age);
            for (SmartDevice smartdevice: network.getSmartDevices()
                 ) {
                List<NormalDevice> normalDevices = smartdevice.getNormalDevicesWith(network,100);
                for (NormalDevice norm: normalDevices
                     ) {
                    System.out.println(smartdevice + "igot: " + norm);
                }
            }
            network.getDevices().forEach(Device::checkIsAlive);
            yearsPassed++;
        }

    }
}
