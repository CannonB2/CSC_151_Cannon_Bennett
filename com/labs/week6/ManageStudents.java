package com.labs.week6;
import java.util.*;

public class ManageStudents {

    // method used to find a student based on a given id
    public static void findStudent(HashMap<Integer, String> map, int id) {
        // if the id is found prints the students name and prints a warning otherwise
        if (map.containsKey(id)) {
            System.out.println("Student with ID " + id + " found. Student name: " + map.get(id));
        } else {
            System.out.println("Student does not exist.");
        }
    }

    // method used to add a student to the hashmap
    public static void addStudent(HashMap<Integer, String> map, int id, String name) {
        // if the hashmap already contains a student with that idea prints a warning and adds them to the hashmap otherwise
        if (map.containsKey(id)) {
            System.out.println("Student ID already exists. Please add a distinct ID.");
        } else {
            map.put(id, name);
        }
    }

    // method used to remove a student from the hashmap
    public static void removeStudent(HashMap<Integer, String> map, int id) {
        // if the hashmap contains the student removes them, prints a message to let the user know, and otherwise prints a warning
        if (map.containsKey(id)) {
            map.remove(id);
            System.out.println("Student with ID of " + id + " has been removed.");
        } else {
            System.out.println("Student does not exist.");
        }
    }
}