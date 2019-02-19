package com.coodecool.network;

public enum Screen {

    EDTV(5),
    HD(10),
    FULL_HD(15),
    UHD(20);

    int requiredPower;

    Screen(int requiredPower) {
        this.requiredPower = requiredPower;
    }

    int getRequiredPower() {
        return requiredPower;
    }

}
