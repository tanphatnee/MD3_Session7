package Bt3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính của Circle: " + circle.getRadius());
        System.out.println("Diện tích của Circle: " + circle.getArea());

        circle = new Circle(2.5);
        System.out.println("Bán kính của Circle: " + circle.getRadius());
        System.out.println("Diện tích của Circle: " + circle.getArea());
    }
}
