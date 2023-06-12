package Bt1;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Giá trị myString ban đầu: " + myObject.getMyString());

        myObject.setMyString("Hello, world!");
        System.out.println("Giá trị myString sau khi thay đổi: " + myObject.getMyString());
    }
}

