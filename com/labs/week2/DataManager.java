package com.labs.week2;

import java.util.*;

public class DataManager<T> {

    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public void get(int index) {
        T itemAtIndex = items.get(index);
        System.out.println(itemAtIndex);
    }

    public int getSize() {
        int itemsSize = items.size();
        return itemsSize;
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
