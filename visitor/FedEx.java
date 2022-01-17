package com.kaboomb.visitor;

public class FedEx implements DeliveryCost {

    @Override
    public void calculate(ParcelMethod parcelMethod) {
        System.out.println("FedEx ParcelMethod");
    }

    @Override
    public void calculate(CourierMethod courierMethod) {
        System.out.println("FedEx CourierMethod");
    }
}
