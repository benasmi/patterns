package com.kaboomb.compositev2;

import java.util.ArrayList;

public class Composite extends Component{

    private ArrayList<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    void operation() {
        components.forEach(Component::operation);
    }

    @Override
    boolean isLeaf() {
        return false;
    }
}
