
abstract class Shape {

    public abstract double area();

    public abstract double perimeter();

    public abstract String getShapeName();
}


class Circle extends Shape {


    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        // Heron's Formula
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}


public class Main {

    public static void main(String[] args) {

        // Array of Shape objects (Polymorphism)
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(8, 4),
                new Triangle(3, 4, 5)
        };

        System.out.println("----------------------------------------------");
        System.out.printf("%-12s %-15s %-15s%n", "Shape", "Area", "Perimeter");
        System.out.println("----------------------------------------------");

        for (Shape shape : shapes) {
            System.out.printf(
                    "%-12s %-15.2f %-15.2f%n",
                    shape.getShapeName(),
                    shape.area(),
                    shape.perimeter()
            );
        }

        System.out.println("----------------------------------------------");
    }
}