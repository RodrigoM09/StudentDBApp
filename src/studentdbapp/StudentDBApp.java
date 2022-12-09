package studentdbapp;

import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args) {

        // Ask how many students are being added
        System.out.println("Enter number of students enrolling: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        System.out.println(students[0].toString());
        System.out.println(students[1].toString());
        System.out.println(students[2].toString());
    }
}