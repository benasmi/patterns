package com.kaboomb.visitor;

public class CourierMethod implements DeliveryMethod {
    @Override
    public void accept(DeliveryCost cost) {
        cost.calculate(this);
    }
}
