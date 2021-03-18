package ru.geekbrains.java3_work1_Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public Task2()
    {
        int[] arr = {1, 2, 3, 4, 5};
//      //String[] arr = {"ручка", "карандаш", "резинка", "тетрадь"};

        ArrayList arrayList = converToArrayList(arr);
    }

    private static <T> ArrayList converToArrayList(T... arr)
    {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}

