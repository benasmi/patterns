package com.kaboomb.mediator;

public class PrincipalColleague extends Colleague{

    public PrincipalColleague(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        mediator.broadcast(this, message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.printf("PrincipalColleague[%s]: %s\n", name, message);
    }
}
