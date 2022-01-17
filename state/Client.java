package com.kaboomb.state;

public class Client {

    public State state;

    public Client() {
        state = new InitialState(this);
    }

    public void nextState() {
        state.nextState(this);
    }

    public void previousState() {
        state.previousState(this);
    }
}
