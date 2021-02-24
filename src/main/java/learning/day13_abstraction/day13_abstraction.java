package learning.day13_abstraction;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public String gender, color, name;
    int age;

    public Animal(String name, String gender, String color, int age) {
        this.gender = gender;
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public abstract void sleep();
    public abstract void eat();

    public String toString() {
        return this.name;
    }
}

class Dog extends Animal {
    public Dog(String name, String gender, String color, int age) {
        super(name, gender, color, age);
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " sleeps 8 hours");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats KFC");
    }
}

class Cat extends Animal {
    public Cat(String name, String gender, String color, int age) {
        super(name, gender, color, age);
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " sleeps 14 hours");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats m&m");
    }
}

class AbstractClasses {
    public static void main(String[] args) {
        // Since Animal class is abstract, we cannot instantiate the class
        // In other words, we cannot create an object from the class
        // Animal myAnimal = new Animal();

        Animal cat = new Cat("Moon", "female", "black and white", 2);
        cat.sleep();

        Animal dog = new Dog("Baxter", "male", "white", 5);
        dog.sleep();

        Zoo myZoo = new Zoo();
        myZoo.addAnimalToZooList(cat);
        myZoo.addAnimalToZooList(dog);
        myZoo.printAllAnimals();
    }

}

class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimalToZooList(Animal animal) {
        animals.add(animal);
    }

    public void printAllAnimals() {
        System.out.println(animals);
    }
}