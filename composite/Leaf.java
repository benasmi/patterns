package com.kaboomb.composite;


public class Leaf extends Component {

    public String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        System.out.printf("[LEAF]=== %s ===\n", name);
    }

    @Override
    boolean isLeaf() {
        return true;
    }
}
