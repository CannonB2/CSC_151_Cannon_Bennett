package com.labs.week6;

// creates the student class
public class Student {
    int id;
    String name;
    String major;
    double gpa;

    @Override 
    public String toString() {
        return "Name: " + name + "      Major: " + major + "        GPA: " + gpa;
    }
}
