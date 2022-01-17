package com.kaboomb.flyweight;

public class Main {
    public static void main(String[] args) {
        Texture texture1 = TextureLoader.getTexture("key1");
        Texture texture2 = TextureLoader.getTexture("key1");
        Texture texture3 = TextureLoader.getTexture("key1");

        texture1.draw();
        texture2.draw();
        texture3.draw();

    }
}
