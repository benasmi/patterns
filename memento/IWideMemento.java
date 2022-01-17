package com.kaboomb.memento;

public interface IWideMemento extends INarrowMemento{
    Originator getState();
    void setState(Originator state);
}
