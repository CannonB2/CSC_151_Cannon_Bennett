/*
Javac -d bin com/labs/week6/*.java
Java -cp bin com/labs/week6/Main

Name: Kallie Bennett
Date: 9/23/2026
Description: 
*/

package com.labs.week6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> studentDirectory = new HashMap<>();
        studentDirectory.put(101, "Lily");
        studentDirectory.put(102, "Trixie");
        studentDirectory.put(103, "Jules");
        studentDirectory.put(104, "Damion");
        studentDirectory.put(105, "Veronica");

        for (Integer id : studentDirectory.keySet()) {
            System.out.println(id + " : " + studentDirectory.get(id));
        }
    }
}