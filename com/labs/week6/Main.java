/*
Javac -d bin com/labs/week6/*.java
Java -cp bin com/labs/week6/Main

Name: Kallie Bennett
Date: 9/23/2026
Description: Program done to test how hashmaps work in java. Designed to look like a directory containing student info.
*/

package com.labs.week6;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // creates an instance of the manageStudents method and the student class
        ManageStudents manageStudents = new ManageStudents();
        Student student = new Student();

        // creates a hashmap to store a students id and name and then stores a number of students
        HashMap<Integer, String> studentDirectory = new HashMap<>();
        studentDirectory.put(101, "Lily");
        studentDirectory.put(102, "Trixie");
        studentDirectory.put(103, "Jules");
        studentDirectory.put(104, "Damion");
        studentDirectory.put(105, "Veronica");

        // runs a loop over the hashmap and prints each student
        for (Integer id : studentDirectory.keySet()) {
            System.out.println(id + " : " + studentDirectory.get(id));
        }

        // finds a given student (assuming they exist) based on a passed in id
        manageStudents.findStudent(studentDirectory, 101);
        manageStudents.findStudent(studentDirectory, 100);

        // adds a student as long as their id is not already in use
        manageStudents.addStudent(studentDirectory, 101, "Harold");
        manageStudents.addStudent(studentDirectory, 106, "Opal");

        // removes a student as long as their id exists
        manageStudents.removeStudent(studentDirectory, 100);
        manageStudents.removeStudent(studentDirectory,104);
        for (Integer id : studentDirectory.keySet()) {
            System.out.println(id + " : " + studentDirectory.get(id));
        }

        // creates a new hashmap to store students using the student class created earlier
        // lists store student info
        HashMap<Integer, Student> studentClassDirectory = new HashMap<>();
        int[] studentIDs = {101, 102, 103, 105};
        String[] studentNames = {"Lily", "Trixie", "Jules", "Veronica"};
        String[] studentMajors = {"Medicine", "Medicine", "Chemistry", "Biology"};
        double[] studentGPAs = {3.8, 3.7, 3.4, 3.0};

        // for loop runs to add each value stored in the above lists to the student class, stores the class in the created hashmap, then resets the student class to a clean slate
        for (int i = 0; i < studentIDs.length; i++) {
            student.id = studentIDs[i];
            student.name = studentNames[i];
            student.major = studentMajors[i];
            student.gpa = studentGPAs[i];
            studentClassDirectory.put(studentIDs[i], student);
            student = new Student();
        }

        // prints each student
        for (Integer id : studentClassDirectory.keySet()) {
            System.out.println("ID: " + id + "      " + studentClassDirectory.get(id).toString());
        }
        
    }
}

/*
    Part 6
    Hashmaps are faster due to being able to search them using key value pairs
    An Arraylist would be preferable when needing to store large quantities of data that are all related to each other
    Keys must be unique in order to accurate search for each key value pair
*/