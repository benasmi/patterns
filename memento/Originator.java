package com.kaboomb.memento;

public class Originator {

    private String value;

    public Originator(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(new Originator(value));
    }

    public void restoreMemento(Memento memento) {
        memento.setState(this);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
