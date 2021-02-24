package learning.day09_Practice_Classes;

public class Rectangle {
    // Action: printFormula (shared --> static),
    //         printLength, printWidth, calculateArea, calculatePerimeter --> (instance)
    // length, width --> instance (each rectangle obj should have it's own measurements)

    // Primitives and default values
    // int, byte, short, long = 0
    // double, float = 0.0
    // boolean = false
    // char = empty

    {
        // instance block
        // This will be executed for each instance or object
        System.out.println("This is instance block");
        length = 10;
        width = 10;
    }

    {
        System.out.println("This is the second instance block");
    }

    static {
        // First thing that will be executed when the class loads
        // Executes only once
        System.out.println("This is a static block");
        // This is the place to initialize static fields
        count = 0;
    }

    public double length; // 0.0
    public double width; // 0.0
    public static int count;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;
    }

    public Rectangle(double size) {
        this(size, size);
    }

    public Rectangle() {
        count++;
    }

    public static void printFormula() {
        System.out.println("Area = Length * Width");
        System.out.println("Perimeter = 2 * (Length + Width)");
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

}

class Tester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle square = new Rectangle(10);
        Rectangle.printFormula();

        System.out.println("Area of r1: " + square.calculateArea());
        System.out.println("Perimeter of r1: " + square.calculatePerimeter());

        System.out.println(Math.pow(10, .5));
        System.out.println(Math.PI);

        Rectangle r2 = new Rectangle();

        System.out.println(Rectangle.count);
    }
}