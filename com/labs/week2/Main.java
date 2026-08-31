/*
Javac -d bin com/labs/week2/*.java
Java -cp bin com/labs/week2/Main
*/

package com.labs.week2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentNames.add("Lily");
        student.studentNames.add("Trixie");
        student.studentNames.add("Sam");
        student.studentNames.add("Jules");
        student.studentNames.add("Damion");

        student.gpas.add(4.0);
        student.gpas.add(3.6);
        student.gpas.add(1.8);
        student.gpas.add(3.1);
        student.gpas.add(2.4);

        
        for (String name : student.studentNames) {
            System.out.println(name);
        }
        for (Double gpa : student.gpas) {
            System.out.println(gpa);
        }

        Box<String> string = new Box<>();
        Box<Integer> integer = new Box<>();
        Box<Student> studentBox = new Box<>();

        GenericUtils<String> stringUtils = new GenericUtils<>();
        stringUtils.printList(student.studentNames);
        String lastStudent = stringUtils.getLast(student.studentNames);
        System.out.println(lastStudent);
        stringUtils.setList(student.studentNames);

        GenericUtils<Double> intUtils = new GenericUtils<>();
        intUtils.printList(student.gpas);


        DataManager<String> stringManager = new DataManager<>();
        DataManager<Integer> intManager = new DataManager<>();
        DataManager<Student> studentManager = new DataManager<>();

        stringManager.add("test 1");
        stringManager.add("test 2");
        stringManager.add("test 3");
        stringManager.add("test 4");
        stringManager.remove("test 3");
        stringManager.get(2);
        System.out.println(stringManager.getSize());
        stringManager.printAll();

        intManager.add(1);
        intManager.add(2);
        intManager.add(3);
        intManager.printAll();

        studentManager.add(student);
        studentManager.printAll();
        
    }
}