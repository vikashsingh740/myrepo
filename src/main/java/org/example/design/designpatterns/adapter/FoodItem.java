package org.example.design.designpatterns.adapter;

public class FoodItem implements Item {
    @Override
    public String getItemName() {
        return "FoodItem";
    }

    @Override
    public double getItemPrice() {
        return 200;
    }

    @Override
    public String getRestaurantName() {
        return "Abc";
    }
}
