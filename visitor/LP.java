package com.kaboomb.visitor;

public class LP implements DeliveryCost {

    @Override
    public void calculate(ParcelMethod parcelMethod) {
        System.out.println("LP ParcelMethod method");
    }

    @Override
    public void calculate(CourierMethod courierMethod) {
        System.out.println("LP CourierMethod method");

    }
}
