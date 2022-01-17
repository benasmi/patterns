package com.kaboomb.memento;

public class Memento implements IWideMemento {

    private final Originator value;

    public Memento(Originator value) {
        this.value = value;
    }

    @Override
    public Originator getState() {
        return value;
    }

    @Override
    public void setState(Originator state) {
        state.setValue(value.getValue());
    }
}
