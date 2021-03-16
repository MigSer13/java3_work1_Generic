package ru.geekbrains.java3_work1_Generic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        System.out.println(arr);

        swapArrayElements(1,2, arr);
        System.out.println(arr);
    }

    public static <T> void swapArrayElements(int e1, int e2, ArrayList<T> ArrObj) {
        T element1 = ArrObj.get(e1);
        T element2 = ArrObj.get(e2);

        ArrObj.set(e1, element2);
        ArrObj.set(e2, element1);

    }
}


