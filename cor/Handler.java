package com.kaboomb.cor;

public abstract class Handler {

    public Handler nextHandler;
    public void process(){
        if(nextHandler != null) {
            nextHandler.process();
        }
    };

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

}
