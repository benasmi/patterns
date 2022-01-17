package com.kaboomb.mediator;

public class TeacherColleague extends Colleague{

    public TeacherColleague(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        mediator.broadcast(this, message);
    }

    @Override
    void receiveMessage(String message) {
        System.out.printf("TeacherColleague[%s]: %s\n", name, message);
    }
}
