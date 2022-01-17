package com.kaboomb.mementov2;

// Data
public class Originator {

    private String someData;
    private String passCode;

    public Originator(String passCode) {
        this.passCode = passCode;
    }

    public Memento save() {
        return new Memento(someData, passCode);
    }

    public void restore(Memento memento) {
        if(!memento.getData(this)){
            System.out.println("Failed to restore");
            return;
        }

        System.out.println("Restored successfully");

    }

    public String getSomeData() {
        return someData;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }
}
