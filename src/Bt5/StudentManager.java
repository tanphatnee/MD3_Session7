package Bt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên mới:");
        System.out.print("Nhập ID sinh viên: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhập giới tính (true/false): ");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        String className = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Student student = new Student(studentID, studentName, sex, className, age, address);
        students.add(student);

        System.out.println("Sinh viên mới đã được thêm thành công!");
    }

    public void updateStudent(int id) {
        boolean isUpdated = false;
        for (Student student : students) {
            if (student.getStudentID() == id) {
                System.out.println("Nhập thông tin cập nhật cho sinh viên:");
                student.inputData();
                System.out.println("Thông tin sinh viên đã được cập nhật thành công!");
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Không tìm thấy sinh viên có ID " + id);
        }
    }

    public void showAllStudent() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student student : students) {
                student.displayData();
                System.out.println("--------------------");
            }
        }
    }

    public void deleteStudent(int id) {
        boolean isDeleted = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == id) {
                students.remove(i);
                System.out.println("Sinh viên có ID " + id + " đã được xoá thành công!");
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Không tìm thấy sinh viên có ID " + id);
        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------- Menu --------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo ID");
            System.out.println("4. Xoá sinh viên theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.showAllStudent();
                    break;
                case 2:
                    studentManager.createStudent();
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần cập nhật: ");
                    int idToUpdate = scanner.nextInt();
                    studentManager.updateStudent(idToUpdate);
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần xoá: ");
                    int idToDelete = scanner.nextInt();
                    studentManager.deleteStudent(idToDelete);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại!");
            }
        }

        System.out.println("Chương trình đã kết thúc.");
    }
}
