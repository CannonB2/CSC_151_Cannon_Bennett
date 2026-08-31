package com.labs.week2;
import java.util.*;

public class GenericUtils<T> {

    ArrayList<List<T>> arrayList = new ArrayList<>();
    
    public void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
    public T getLast(List<T> list) {
        T last = (list.getLast());
        return last;
    }

    public  void setList(List<T> list) {
        arrayList.add(list);
    }

}
