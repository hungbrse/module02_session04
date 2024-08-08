package module_session4.ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Để tiêu thụ ký tự xuống dòng

            switch (choice) {
                case 1:
                     int index = 1;
                    for (Student student : students) {

                        System.out.println("học sinh thứ :" + index++);
                        student.displayData();
                        System.out.println("---------------------------------------");
                    }


                    break;
                case 2:

                    Student newstudent = new Student();

                    newstudent.inputData();

                    students.add(newstudent);


                case 3:
                    // Sửa thông tin học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã HS cần sửa: ");
                    String maHS = scanner.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(maHS)) {
                            System.out.println("Nhập thông tin mới cho học sinh:");
                            student.inputData();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã HS: " + maHS);
                    }
                    break;
                case 4:
                    // Xoá học sinh
                    System.out.print("Nhập mã HS cần xoá: ");
                    maHS = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getStudentId().equals(maHS)) {
                            students.remove(i);
                            System.out.println("Đã xoá học sinh với mã HS: " + maHS);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã HS: " + maHS);
                    }
                    break;
                case 5:
                    // Thoát
                    System.out.println("Chương trình kết thúc.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}