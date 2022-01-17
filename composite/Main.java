package com.kaboomb.composite;

public class Main {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");
        Leaf leaf4 = new Leaf("Leaf 4");

        Composite composite1 = new Composite("Composite 1");
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        composite1.add(leaf4);

        Composite composite2 = new Composite("Composite 2");
        composite2.add(composite1);
        composite2.operation();
    }
}
