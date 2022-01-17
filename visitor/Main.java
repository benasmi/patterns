package com.kaboomb.visitor;

public class Main {

    public static void main(String[] args) {
        DeliveryCost lpCost = new LP();
        DeliveryCost fedExCost = new FedEx();

        DeliveryMethod courierMethod = new CourierMethod();
        courierMethod.accept(lpCost);
        courierMethod.accept(fedExCost);

        DeliveryMethod parcelMethod = new ParcelMethod();
        parcelMethod.accept(lpCost);
        parcelMethod.accept(fedExCost);

    }

}
