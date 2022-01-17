package com.kaboomb.proxy;

public class Main {

    public static void main(String[] args){
        Subject proxySubject = new ProxySubject(new RealSubject());

        proxySubject.operation();
    }
}
