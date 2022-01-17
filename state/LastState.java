package com.kaboomb.state;

public class LastState extends State {

    private int count = 0;
    private Client client;

    public LastState(Client client) {
        this.client = client;
    }

    @Override
    void operation() {
        count += 1;
        System.out.println("LastState: " + count);

        if (count >= 2) {
            nextState(client);
        }
    }


    @Override
    void nextState(Client client) {
        client.state = new InitialState(client);
    }

    @Override
    void previousState(Client client) {
        client.state = new SecondState(client);
    }
}
