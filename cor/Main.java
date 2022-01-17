package com.kaboomb.cor;

public class Main {

    public static void main(String[] args) {
        Handler blockListHandler = new BlockListHandler();

                blockListHandler.setNextHandler(new LoggingHandler())
                .setNextHandler(new RequestHandler());

        blockListHandler.process();
    }
}
