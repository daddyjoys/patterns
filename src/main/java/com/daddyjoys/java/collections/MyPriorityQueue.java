package com.daddyjoys.java.collections;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args){
        // https://vertex-academy.com/tutorials/ru/queue-java-primer/
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for (int i:myPriorityQueue){
            System.out.println(i);
        }
    }
}
