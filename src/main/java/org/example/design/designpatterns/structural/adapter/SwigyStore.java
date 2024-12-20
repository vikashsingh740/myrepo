package org.example.design.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class SwigyStore {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }
}
