package com.labs.week3;
import java.util.*;

public class Storage<T> {
    private ArrayList<T> items;
    private int count = 0;

    public Storage(int size) {
        items = new ArrayList<>(size);
    }

    public void add(T item) {
        items.add(item);
        count++;
    }

    public T get(int index) {
        return items.get(index);
    }

    public int size() {
        return count;
    }
}