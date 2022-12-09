package studentdbapp;

import java.util.Objects;
import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private String courses;
    private String studentID;
    private static int costOfCourse = 600;
    private int tuitionBalance = 0;
    private static int id = 1000;

    // Constructor: prompt user to enter students name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstname = scanner.nextLine();

        System.out.println("Enter student last name ");
        this.lastname = scanner.nextLine();

        System.out.println("1 - Freshman\n2- Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();
       // System.out.println(firstname + " " + lastname + " " + gradeYear);

        setStudentID();

       // System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentID);
    }
    // Generate ID
    private void setStudentID(){
        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!Objects.equals(course, "Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);


       // System.out.println("Enrolled in: " + courses);
       // System.out.println("Tuition Balance: " + tuitionBalance);
    }
    // View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }
    // Show Status
    public String toString(){
        return "Name: " + firstname + " " + lastname +
                "\nGrade Year: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance $" + tuitionBalance;

    }
}
