package com.daddyjoys.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        // https://vertex-academy.com/tutorials/ru/map-v-java-hashmap/
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<String, Integer>();
        myMap.put("Odin", 1);
        myMap.put("Two", 2);
        for (Map.Entry<String, Integer> entry: myMap.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(myMap.get("Two"));
    }
}
