package org.example.design.designpatterns.adapter;

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
