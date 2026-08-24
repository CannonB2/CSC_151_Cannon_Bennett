/*
Javac -d bin com/labs/week1/*.java
Java -cp bin com/labs/week1/Main
*/

package com.labs.week1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        Student student = new Student();
        Scanner userInput = new Scanner(System.in);
        String action = "";

        // I tried to figure out a faster way to create students but I could not get it to work
        student.id = 1;
        student.name = "Lily";
        student.major = "Doctor"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 2;
        student.name = "Trixie";
        student.major = "Doctor"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 3;
        student.name = "Jules";
        student.major = "Chemistry"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 4;
        student.name = "Marcus";
        student.major = "Engineering"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 5;
        student.name = "Veronica";
        student.major = "Biology"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 6;
        student.name = "Lily";
        student.major = "doctor"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 7;
        student.name = "Damian";
        student.major = "Law"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 8;
        student.name = "Opal";
        student.major = "Cyber Security"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 9;
        student.name = "Sam";
        student.major = "Meteorology"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        student = new Student();
        student.id = 10;
        student.name = "Hattie";
        student.major = "Engineering"; 
        student.courses = new ArrayList<>();
        courseManager.addStudent(student);

        System.out.println("----------------------------------------");
        System.out.println("Student Database");
        while (!(action.contentEquals("4"))) {
            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.println("Type the number for what you would like to do");
            action = userInput.nextLine();

            if (action.contentEquals("1")) {
                int newID = student.id + 1;
                student = new Student();
                student.id = newID;
                System.out.println("Please enter the students name");
                action = userInput.nextLine();
                student.name = action;
                System.out.println("Please enter the students major");
                action = userInput.nextLine();
                student.major = action;
                student.courses = new ArrayList<>();
                courseManager.addStudent(student);
                System.out.println("Student successfully added.");
            } else if (action.contentEquals("2")) {
                courseManager.displayAllStudents();
            } else if (action.contentEquals("3")) {
                System.out.println("Searching for student based on their ID, Please enter ID");
                action = userInput.nextLine();
                courseManager.findStudentById(Integer.parseInt(action));
            }
            System.out.println("----------------------------------------");
        }
        System.out.println("Thank you for coming!");
    }
}