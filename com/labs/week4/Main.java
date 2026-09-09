/*
Javac -d bin com/labs/week4/*.java
Java -cp bin com/labs/week4/Main
*/

package com.labs.week4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Lily");
        students.add("Trixie");
        students.add("Jules");
        students.add("Sam");
        students.add("Marcus");
        students.add("Veronica");
        students.add("Damion");
        students.add("Opal");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        for (String name : students) {
            System.out.println(name);
        }
    }
}