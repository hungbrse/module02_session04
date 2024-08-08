package module_session4.ex9;

import java.util.Scanner;

public class Student {
    private  String studentId;
    private String studentName;
    private int studentAge;
    private String studentGender;
    private String studentAddress;
    private String studentPhone;


    public Student(String studentId, String studentName, int studentAge, String studentGender, String studentAddress, String studentPhone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentPhone = studentPhone;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }


    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student ID: " + studentId);
        studentId = sc.nextLine();
        System.out.println("Student Name: " + studentName);
        studentName = sc.nextLine();
        System.out.println("Student Age: " + studentAge);
        studentAge = Integer.parseInt(sc.nextLine());
        System.out.println("Student Gender: " + studentGender);
        studentGender = sc.nextLine();
        System.out.println("Student Address: " + studentAddress);
        studentAddress = sc.nextLine();
        System.out.println("Student Phone: " + studentPhone);
        studentPhone = sc.nextLine();
    }

    public Student() {
    }

    public void displayData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Gender: " + studentGender);
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Student Phone: " + studentPhone);

    }

}
