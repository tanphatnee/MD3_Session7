package Th3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("A","hihi", 22, true);
        Person p2 = new Person("B","haha", 11, false);
        System.out.println(p1.getFirstName());
        System.out.println("name p2 : " + p2.getFirstName() + " " + p2.getLastName());


    }
}
