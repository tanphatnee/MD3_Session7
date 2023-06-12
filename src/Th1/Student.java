package Th1;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "RIKKEI ACADEMY";
    }

    //method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
