/*
Javac -d bin com/labs/week2/*.java
Java -cp bin com/labs/week2/Main
*/

package com.labs.week2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");

        Box<Integer> n = new Box<>();
        n.set(100);
    }
}