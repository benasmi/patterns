package com.kaboomb.visitor;

public interface DeliveryCost {
    void calculate(ParcelMethod parcelMethod);
    void calculate(CourierMethod courierMethod);
}
