package learning.day12_overloading_overriding;

public class Car {
    // Name, manufacturer

    String name;
    String manufacturer;
    int numberOfSeats = 0;

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void start() {
        System.out.println("Start with key...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

}

class ElectricCar extends Car {

    public ElectricCar(String n, String man) {
        super(n, man);
        numberOfSeats = 2;
    }

    public void start() {
        System.out.println("Keyless start...");
    }

    public void charge() {
        System.out.println("Charging...");
    }
}

class TestingCars {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar("Model 3", "Tesla");

        obj.start();
        obj.charge();

    }
}

