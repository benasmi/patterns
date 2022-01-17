package com.kaboomb.compositev2;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();

        Composite composite = new Composite();
        composite.add(leaf1);

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(composite);

        composite1.operation();
    }
}
