package com.daddyjoys.java.primitives;

public class MyArray {
    public static void main(String[] args){
        Integer[] myArray1 = new Integer[3];
        myArray1[0]=5;
        myArray1[1]=17;
        myArray1[2]=350;

        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);

        for (int i = 0; i<myArray1.length;i++){
            System.out.println(myArray1[i]);
        }
    }
}
