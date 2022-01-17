package com.kaboomb.cor;

public class LoggingHandler extends Handler {
    @Override
    public void process() {
        System.out.println("LoggingHandler");
        super.process();
    }
}
