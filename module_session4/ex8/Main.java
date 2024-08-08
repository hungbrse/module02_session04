package module_session4.ex8;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("nhân viên thứ" + (i + 1));
            employees[i] = new Employee();
            employees[i].inputData();
        }


        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }



    }
}
