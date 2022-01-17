package com.kaboomb.compositev2;

public class Leaf extends Component {
    @Override
    void operation() {
        System.out.println("Leaf");
    }

    @Override
    boolean isLeaf() {
        return true;
    }
}
