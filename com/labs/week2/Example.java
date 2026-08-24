/*
Javac -d bin com/labs/week2/*.java
Java -cp bin com/labs/week2/Example
*/

package com.labs.week2;

import java.util.*;

public class Example {
    public void testArrays(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");

        Box<Integer> n = new Box<>();
        n.set(100);
    }
}