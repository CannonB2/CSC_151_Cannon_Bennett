
package com.labs.week1;

import java.util.*;

public class CourseManager {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void findStudentById(int id) {
        boolean found = false;

        for (Student student : students) {
            if (student.id == id) {
                System.out.println("Student at id " + id + ": \nName: " + student.name + " \nMajor: " + student.major + " \nCourses:");
                for (String course : student.courses) {
                    System.out.println(course);
                }
                found = true;
            }
        }

        if (!(found)) {
            System.out.println("ID is not in system. Please try again with a valid ID.");
        }
    }

    public void displayAllStudents() {
        System.out.println("Printing all students");
        for (Student student : students) {
            System.out.println("Id: " + student.id + "      Name: " + student.name + "       Major: " + student.major);
        }
    }
}