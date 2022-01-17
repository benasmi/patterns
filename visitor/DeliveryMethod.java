package com.kaboomb.visitor;

public interface DeliveryMethod {
    void accept(DeliveryCost cost);
}
