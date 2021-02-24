package learning.day08;

public class Car {
    // instance fields: make, model, car, year, price
    // actions (methods): start, driving, getInfo

    public static int count;
    public String make, model, color;
    public int year;
    public double price;

    // Constructor

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void getInfo() {
        System.out.println(
                "Make: " + this.make +
                "\nModel: " + this.model +
                "\nColor: " + this.color +
                "\nYear: " + this.year +
                "\nPrice: $" + this.price
        );
    }

    // Shows the object instead of hash code
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}

class Tester {
    public static void main(String[] args) {
        // Car object
        Car c1 = new Car("Toyota", "Supra", "Green", 2021, 50000);
        Car c2 = new Car("Ford", "Mustang", "Black", 2020, 30000);

        // c1.make = "Toyota"; // modify a field in the object
        System.out.println(c1.make);
        System.out.println(c1.color);
        System.out.println(c1.year);

        // Make: Toyota
        // Model: Supra
        // Color: Green
        // Year: 2021
        // Price: 50000
        c1.getInfo();
        c2.getInfo();
        System.out.println(c1);

    }
}