package studentdbapp;

import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private String courses;
    private int studentId;
    private int cost = 600;
    private int balance;

    // Constructor: prompt user to enter students name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstname = scanner.nextLine();

        System.out.println("Enter student last name ");
        this.lastname = scanner.nextLine();

        System.out.println("1 - Freshman\n2- Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstname + " " + lastname + " " + gradeYear);
    }
    // Generate ID

    // Enroll in courses

    // View Balance

    // Pay Tuition

    // Show Status
}
