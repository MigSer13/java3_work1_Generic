package ru.geekbrains.java3_work1_Generic.Task3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> quantity;
    private float weightBox;

    public <T>Box() {
        quantity = new ArrayList<>();
    }

    public void addFruit(T fruit){
        this.quantity.add(fruit);
    }

    public float getWeightBox(){
        if(quantity.size() > 0) {
            return quantity.size() * quantity.get(0).getWeight();
        }else{
            return 0f;
        }
    }

    public boolean compare(Box box){
        if(box.getWeightBox() == weightBox) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<T> getListFruit(){
        return quantity;
    }

    public void dragOutTo(Box<T> box){
        for (T fruit : quantity){
            box.getListFruit().add(fruit);
        }
        quantity.clear();
    }
}