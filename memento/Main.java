package com.kaboomb.memento;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<INarrowMemento> mementoList = new ArrayDeque<>();

        Originator originator1 = new Originator("Value");
        mementoList.add(originator1.createMemento());

        originator1.setValue("Some other value");
        mementoList.add(originator1.createMemento());

        originator1.setValue("Last value");

        System.out.println(originator1.getValue());
        originator1.restoreMemento((Memento) Objects.requireNonNull(mementoList.pollLast()));
        System.out.println(originator1.getValue());
        originator1.restoreMemento((Memento) Objects.requireNonNull(mementoList.pollLast()));
        System.out.println(originator1.getValue());

    }
}
