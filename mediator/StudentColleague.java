package com.kaboomb.mediator;

public class StudentColleague extends Colleague {

    public StudentColleague(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        mediator.broadcast(this, message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.printf("StudentColleague[%s]: %s\n", name, message);
    }
}
