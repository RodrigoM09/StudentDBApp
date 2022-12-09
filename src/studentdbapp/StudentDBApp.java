package studentdbapp;

public class StudentDBApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        System.out.println(student1.toString());
        // Ask how many user are being added

        // Create n number of new students
    }
}