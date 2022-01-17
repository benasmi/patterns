package com.kaboomb.flyweight;

public class Sprite implements Texture {

    public String url;

    public Sprite(String url) {
        this.url = url;
    }

    @Override
    public void draw() {
        System.out.println("Draw sprite" + url);
    }
}
