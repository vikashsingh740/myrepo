package org.example.design.designpatterns.adapter;

public class GroceryAdapter implements Item {

    GroceryProduct groceryProduct;

    public GroceryAdapter(GroceryProduct groceryProduct){
        this.groceryProduct = groceryProduct;
    }

    @Override
    public String getItemName() {
        return groceryProduct.getItemName();
    }

    @Override
    public double getItemPrice() {
        return groceryProduct.getItemPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryProduct.getStoreName();
    }
}
