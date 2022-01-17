package com.kaboomb.state;

public abstract class State {

    abstract void operation();
    abstract void nextState(Client client);
    abstract void previousState(Client client);

}
