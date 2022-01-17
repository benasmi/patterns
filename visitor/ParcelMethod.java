package com.kaboomb.visitor;

public class ParcelMethod implements DeliveryMethod {

    @Override
    public void accept(DeliveryCost cost) {
        cost.calculate(this);
    }
}
