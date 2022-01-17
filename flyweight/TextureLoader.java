package com.kaboomb.flyweight;

import java.util.HashMap;

public class TextureLoader {

    public static HashMap<String, Texture> textureHashMap = new HashMap<>();

    public static Texture getTexture(String key) {
        if(textureHashMap.containsKey(key)) {
            System.out.println("Receiving existing texture with key = " + key);
            return textureHashMap.get(key);
        }

        System.out.println("Creating new texture with key = " + key);
        Texture t = new Sprite(key);
        textureHashMap.put(key, t);

        return t;
    }
}
