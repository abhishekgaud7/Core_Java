package com_Assesment;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int serialNumber;
    String firstName, lastName, contactNumber, subject;
    int marks, fees;

    Student(int serialNumber, String firstName, String lastName, String contactNumber, String subject, int marks, int fees) {
        this.serialNumber = serialNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.subject = subject;
        this.marks = marks;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Serial Number: " + serialNumber + "\nName: " + firstName + " " + lastName + "\nContact: " + contactNumber + 
               "\nSubject: " + subject + "\nMarks: " + marks + "\nFees: " + fees;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("press 1 for Counsellor");
            System.out.println("press 2 for Faculty");
            System.out.println("press 3 for Student");
            int roleId = scanner.nextInt();
            switch (roleId) {
                case 1: // Counsellor
                    counsellorMenu();
                    break;
                case 2: // Faculty
                    facultyMenu();
                    break;
                case 3: // Student
                    System.out.println("Student functionality not yet implemented.");
                    break;
                default:
                    System.out.println("Invalid role, please try again.");
            }
        }
    }

    // Counsellor menu
    public static void counsellorMenu() {
        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. View all students");
            System.out.println("4. View specific student");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewSpecificStudent();
                    break;
                case 5:
                    return; // Exit counsellor menu
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    // Faculty menu
    public static void facultyMenu() {
        while (true) {
            System.out.println("1. Add marks to student");
            System.out.println("2. View all students");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMarksToStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    return; // Exit faculty menu
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    // Function to add a student
    public static void addStudent() {
        try {
            System.out.println("Enter Serial Number:");
            int serial = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter First Name:");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                System.out.println("First Name cannot be empty");
                return;
            }
            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter Contact Number (10 digits):");
            String contact = scanner.nextLine();
            if (!contact.matches("\\d{10}")) {
                System.out.println("Invalid Contact Number, must be 10 digits");
                return;
            }
            System.out.println("Enter Subject:");
            String subject = scanner.nextLine();
            System.out.println("Enter Marks:");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks, must be between 0 and 100");
                return;
            }
            System.out.println("Enter Fees:");
            int fees = scanner.nextInt();

            Student student = new Student(serial, firstName, lastName, contact, subject, marks, fees);
            students.add(student);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Clear the scanner
        }
    }

    // Function to remove a student
    public static void removeStudent() {
        System.out.println("Enter Serial Number of student to remove:");
        int serial = scanner.nextInt();
        boolean removed = students.removeIf(student -> student.serialNumber == serial);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Function to view all students
    public static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
                System.out.println("-------------------------");
            }
        }
    }

    // Function to view a specific student
    public static void viewSpecificStudent() {
        System.out.println("Enter Serial Number of student:");
        int serial = scanner.nextInt();
        for (Student student : students) {
            if (student.serialNumber == serial) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Faculty function to add marks to a student
    public static void addMarksToStudent() {
        System.out.println("Enter Serial Number of student to add marks:");
        int serial = scanner.nextInt();
        for (Student student : students) {
            if (student.serialNumber == serial) {
                System.out.println("Enter new marks:");
                int newMarks = scanner.nextInt();
                if (newMarks >= 0 && newMarks <= 100) {
                    student.marks = newMarks;
                    System.out.println("Marks updated successfully!");
                } else {
                    System.out.println("Invalid Marks, must be between 0 and 100.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
