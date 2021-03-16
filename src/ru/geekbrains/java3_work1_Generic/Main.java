package ru.geekbrains.java3_work1_Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        System.out.println(arr);

        new AnyArray<ArrayList>().swapArrayElements(1, 2, arr);
        System.out.println(arr);
    }

//    public static <T> void swapArrayElements(int e1, int e2, <T>ArrObj)
//    {
//        T element1 = ArrObj.get(e1);
//        T element2 = ArrObj.get(e2);
//
//        ArrObj.set(e1, element2);
//        ArrObj.set(e2, element1);
//
//    }

    public static class AnyArray<T extends List> {

        public void swapArrayElements(int e1, int e2, T receivedArray)
        {
            Object element1 = receivedArray.get(e1);
            Object element2 = receivedArray.get(e2);

            receivedArray.set(e1, element2);
            receivedArray.set(e2, element1);
        }
    }
}


