package com.kaboomb.iterator;


import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Container<String> container = new Container<>();
        HashMap<String, String> map = new HashMap<>();

        container.add("Test1");
        container.add("Test2");

        map.put("Test", "Test");
        map.put("Test1", "Test1");


        Iterator<String> iterator = container.iterator();

        for(String t: container) {
            System.out.println(t);
        }

        for(var a: map.values()) {
            System.out.println(a);
        }

    }
}
