package org.example.design.designpatterns.structural.adapter;

public class GroceryProduct implements GroceryItem {
    @Override
    public String getItemName() {
        return "";
    }

    @Override
    public double getItemPrice() {
        return 0;
    }

    @Override
    public String getStoreName() {
        return "";
    }
}
