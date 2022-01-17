package com.kaboomb.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private final ArrayList<Component> components = new ArrayList<>();
    public String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        System.out.printf("[COMPOSITE]=== %s ===%n\n", name);
        components.forEach(Component::operation);
    }

    @Override
    boolean isLeaf() {
        return false;
    }

    public void add(Component item) {
        components.add(item);
    }

    public void remove(Component item) {
        components.remove(item);
    }

    public List<Component> getChildren() {
        return components;
    }
}
