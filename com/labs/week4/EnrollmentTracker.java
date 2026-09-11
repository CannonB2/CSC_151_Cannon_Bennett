package com.labs.week4;
import java.util.*;

public class EnrollmentTracker {

    // creates a method to check if a students name is stored in the ArrayList
    public static boolean studentExists(ArrayList<String> list, String name) {

        // creates a new variable that stores whether or not a name exists
        boolean exists = false;

        // runs a loop over the list. If the name is found then sets the exists variable to true
        for (String entry : list) {
            if (entry == name) {
                exists = true;
            }
        }

        // returns the exists variable
        return exists;
    }

    // creates a method that removes a student from the ArrayList
    public static void removeStudent(ArrayList<String> list, String name) {

        // checks if the students name exists and assigns the result to a variable
        boolean exists = studentExists(list, name);

        // if the student does not exist prints a message and removes them and prints a message otherwise
        if (!exists) {
            System.out.println("Name was not found. Please enter a valid name.");
        } else {
            // runs a loop over the list till coming across the stored name and then removes it
            for (int i = 0; i <= list.size()-1; i++) {
                if (list.get(i) == name) {
                    list.remove(i);
                    System.out.println("Student successfully removed.");
                }
            }
        }
    }

    // creates a method to add a student as long as it does not already exist
    public static void addStudent(ArrayList<String> list, String name) {

        // checks if the students name exists and assigns the result to a variable
        boolean exists = studentExists(list, name);

        // if the name does not exist then adds it to the list and prints a message
        if (!exists) {
            list.add(name);
            System.out.println("Student successfully added.");
        }
    }

    // creates a method that checks how many times a name exists in the list
    public static int countOccurences(ArrayList<String> list, String name) {

        // creates a variable to store the amount of times the name occurs
        int occurences = 0;

        // runs a for-loop over the list. if the entry is the same as the name then increases occurences.
        for (String entry : list) {
            if (entry == name) {
                occurences++;
            }
        }

        // returns the amount of times the name has occured
        return occurences;
    }
}