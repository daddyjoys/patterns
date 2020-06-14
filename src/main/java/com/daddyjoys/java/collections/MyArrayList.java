package com.daddyjoys.java.collections;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        for (int i: arrayList
             ) {
            System.out.println(i);
        }
    }
}
