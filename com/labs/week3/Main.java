/*
Javac -d bin com/labs/week3/*.java
Java -cp bin com/labs/week3/Main
*/

package com.labs.week3;

public class Main {
    public static void main(String[] args) {
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        arrayPrinter.lineSeparator("Part 2");
        Storage<String> stringStorage = new Storage<>(5);
        stringStorage.add("Please");
        stringStorage.add("Just");
        stringStorage.add("Work");

        for (int i = 0; i < stringStorage.size(); i++) {
            System.out.println(stringStorage.get(i));
        }

        Storage<Integer> intStorage = new Storage<>(5);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(4);
        intStorage.add(5);

        for (int i = 0; i < intStorage.size(); i++) {
            System.out.println(intStorage.get(i));
        }

        arrayPrinter.lineSeparator("Part 3");
        String[] stringArray = {"I'm", "tired", "boss"};
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {0.1, 0.2, 0.3};
        arrayPrinter.printArray(stringArray);
        arrayPrinter.printArray(intArray);
        arrayPrinter.printArray(doubleArray);
    }
}