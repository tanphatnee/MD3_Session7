package Bt3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        // Constructor không tham số
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
