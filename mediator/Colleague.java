package com.kaboomb.mediator;

public abstract class Colleague {

    protected final String name;
    protected final Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void receiveMessage(String message);

}
