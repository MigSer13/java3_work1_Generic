package ru.geekbrains.java3_work1_Generic;

import ru.geekbrains.java3_work1_Generic.Task3.Apple;
import ru.geekbrains.java3_work1_Generic.Task3.Box;
import ru.geekbrains.java3_work1_Generic.Task3.Orange;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args)
    {
        System.out.println("Task1");
        new Task1();
        new Task2();

        //TAsk3
        System.out.println("Task3");
        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Orange> boxO = new Box<Orange>();
        boxO.addFruit(orange);
        boxO.addFruit(orange);
        boxO.addFruit(orange);
        boxO.addFruit(orange);

        Box<Orange> boxO2 = new Box<Orange>();
        boxO2.addFruit(orange);
        boxO2.addFruit(orange);

        Box<Apple> boxA = new Box<Apple>();
        boxA.addFruit(apple);
        boxA.addFruit(apple);
        boxA.addFruit(apple);
        boxA.addFruit(apple);
        boxA.addFruit(apple);

        System.out.println("Короб с апельсинами равен по весу коробку с яблоками: " + boxO.compare(boxA));
        System.out.println("Вес короба 1 с апельсинами: " + boxO.getWeightBox());
        System.out.println("Вес короба 2 с апельсинами: " + boxO2.getWeightBox());
        System.out.println("Вес короба с яблоками: " + boxA.getWeightBox());

        boxO2.dragOutTo(boxO);
        System.out.println("Вес короба 1 с апельсинами: " + boxO.getWeightBox());
        System.out.println("Вес короба 2 с апельсинами: " + boxO2.getWeightBox());
    }
}

