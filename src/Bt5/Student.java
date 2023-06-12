package Bt5;

import java.util.Scanner;

public class Student {
    private int studentID;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student(int studentID, String studentName, boolean sex, String className, int age, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên: ");
        studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        studentName = scanner.nextLine();
        System.out.print("Nhập giới tính (true/false): ");
        sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        className = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ID: " + studentID);
        System.out.println("Tên: " + studentName);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lớp: " + className);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }
}
