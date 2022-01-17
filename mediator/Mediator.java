package com.kaboomb.mediator;

public abstract class Mediator {

    abstract void broadcast(Colleague colleague, String message);
    abstract void addColleague(Colleague colleague);

}
