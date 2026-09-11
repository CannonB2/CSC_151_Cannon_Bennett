/*
Javac -d bin com/labs/week4/*.java
Java -cp bin com/labs/week4/Main
*/

package com.labs.week4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // creates new enrollment tracker instance
        EnrollmentTracker enrollmentTracker = new EnrollmentTracker();
        
        // creates new ArrayList containing student names stored as strings and adds names to it
        ArrayList<String> students = new ArrayList<>();
        students.add("Lily");
        students.add("Trixie");
        students.add("Jules");
        students.add("Sam");
        students.add("Marcus");
        students.add("Veronica");
        students.add("Damion");
        students.add("Opal");

        // Runs two different for-loops over students and print the names stored inside
        System.out.println("--------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("--------------------------------------");
        for (String name : students) {
            System.out.println(name);
        }

        // checks if a name is stored in the students array and prints a message
        System.out.println("--------------------------------------");
        System.out.println("Student exists: " + enrollmentTracker.studentExists(students, "Opal"));
        System.out.println("--------------------------------------");

        // runs methods to remove three students and add a student
        enrollmentTracker.removeStudent(students, "Sam");
        enrollmentTracker.removeStudent(students, "Lily");
        enrollmentTracker.removeStudent(students, "Opal");
        enrollmentTracker.addStudent(students, "Artemis");

        // prints the names in students to show everything was proper removed and added
        System.out.println("--------------------------------------");
        for (String name : students) {
            System.out.println(name);
        }
        System.out.println("--------------------------------------");

        // adds two duplicate students and then runs methods to show how many times different names occur
        students.add("Damion");
        students.add("Damion");
        System.out.println("Damion's name occurs " + enrollmentTracker.countOccurences(students, "Damion") + " times");
        System.out.println("Jules' name occurs " + enrollmentTracker.countOccurences(students, "Jules") + " times");
        System.out.println("Hank's name occurs " + enrollmentTracker.countOccurences(students, "Hank") + " times");
        System.out.println("--------------------------------------");

        // I think we may have mentioned something about part 7 but I can't remember. The instructions aren't there so either way I can't really do it.
    }
}