package com.kaboomb.proxy;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        System.out.println("Proxy operation");
        subject.operation();
    }
}
