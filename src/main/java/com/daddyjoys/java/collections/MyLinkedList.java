package com.daddyjoys.java.collections;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);

        for (int i=0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        for (int i: linkedList
        ) {
            System.out.println(i);
        }
    }
}
