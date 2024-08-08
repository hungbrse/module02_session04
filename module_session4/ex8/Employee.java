package module_session4.ex8;

import java.util.Scanner;

public class Employee {
    private int  employeeId ;
    private String employeeName ;
    private int age;
    private  String gen;
    private int rate;
    private int salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, String gen, int rate, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public void inputData() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" id nhân viên :");
        employeeId = Integer.parseInt(sc.nextLine());
        System.out.println(" tên nhân viên :");
        employeeName = sc.nextLine();
        System.out.println(" tuổi  nhân viên :");
        age = Integer.parseInt(sc.nextLine());
        System.out.println(" giới tính nhân viên :");
        gen = sc.nextLine();
        System.out.println(" rate nhân viên :");
       rate = Integer.parseInt(sc.nextLine());
    }
    public int salary() {
        return salary = 1300000 * rate;
    }

    public void display() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Age :" + age);
        System.out.println("Gen : " + gen);
        System.out.println("Rate : " + rate);
        System.out.println("Salary : " +  salary());
    }


}
