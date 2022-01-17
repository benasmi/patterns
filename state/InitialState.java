package com.kaboomb.state;

public class InitialState extends State {

    private int count = 0;
    private Client client;

    public InitialState(Client client) {
        this.client = client;
    }

    @Override
    void operation() {
        count += 1;
        System.out.println("InitialState: " + count);

        if (count >= 2) {
            nextState(client);
        }
    }

    @Override
    void nextState(Client client) {
        client.state = new SecondState(client);
    }

    @Override
    void previousState(Client client) {
        client.state = new LastState(client);
    }
}
