package org.example.design.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        SwigyStore swigyStore = new SwigyStore();
        swigyStore.addItem(new FoodItem());
        swigyStore.addItem(new FoodItem());
        swigyStore.addItem(new GroceryAdapter(new GroceryProduct()));
    }
}
