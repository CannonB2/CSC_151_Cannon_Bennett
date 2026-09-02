package com.labs.week3;
import java.util.*;

public class ArrayPrinter {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void lineSeparator(String string) {
        System.out.println("--------------------------------");
        System.out.println(string);
        System.out.println("--------------------------------");
    }
}