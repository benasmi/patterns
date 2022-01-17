package com.kaboomb.mementov2;

// Saving originator data
public class Memento {

    private final String someData;
    private final String passCode;

    public Memento(String someData, String passCode) {
        this.someData = someData;
        this.passCode = passCode;
    }

    public boolean getData(Originator originator) {
        if(!originator.getPassCode().equals(passCode)){
            return false;
        }

        originator.setSomeData(someData);
        return true;
    }

}
