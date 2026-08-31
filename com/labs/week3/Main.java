/*
Javac -d bin com/labs/week3/*.java
Java -cp bin com/labs/week3/Main
*/

package com.labs.week2;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>(5);

        stringStorage.add("test");
    }
}