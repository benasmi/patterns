package com.kaboomb.proxy;

public class RealSubject implements Subject{

    @Override
    public void operation() {
        System.out.println("Real subject");
    }
}
