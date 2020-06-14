package com.daddyjoys.java.collections;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args){
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        for (int i : myHashSet)
            System.out.println(i);
    }
}
