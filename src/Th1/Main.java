package Th1;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1, "A");
        Student s2 = new Student(1, "B");
        Student s3 = new Student(1, "C");
        s1.display();
        s2.display();
        s3.display();
    }
}
