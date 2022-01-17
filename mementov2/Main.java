package com.kaboomb.mementov2;

import java.util.ArrayDeque;
import java.util.Deque;

// Caretaker
public class Main {
    public static void main(String[] args) {
        Deque<Memento> mementos = new ArrayDeque<>();

        Originator originator = new Originator("Password");
        Originator someOtherOriginator = new Originator("Other password");

        originator.setSomeData("Test1"); // Originator: passcode - Password
        mementos.add(originator.save()); // Memento: passCode - Password, someData - Test1

        Memento memento = mementos.pop();

        originator.restore(memento); // Memento: Password == Originator: Password
        someOtherOriginator.restore(memento); //(should fail) Memento: Password == Originator: Other password
    }
}
