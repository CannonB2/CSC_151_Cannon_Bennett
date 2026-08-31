package com.labs.week2;
import java.util.*;

public class Storage<T> {
    private T[] items;
    private int count = 0;

    public Storage(int size) {
        items = (T[]) new Object[size];
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {

        return null;
    }

    public int size() {
        return count;
    }
}