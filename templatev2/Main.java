package com.kaboomb.templatev2;

public class Main {

    public static void main(String[] args) {
        ConcreteTemplate concreteTemplate = new ConcreteTemplate();
        concreteTemplate.execute();

        System.out.println();

        OtherConcreteTemplate otherConcreteTemplate = new OtherConcreteTemplate();
        otherConcreteTemplate.execute();
    }
}
