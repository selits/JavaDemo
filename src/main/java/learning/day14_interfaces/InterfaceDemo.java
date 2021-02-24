package learning.day14_interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.animalSound();
        cat.run();
        cat.methodC();

        Dog dog = new Dog();
        dog.run();
        dog.walking();
        dog.methodC();

        System.out.println(Animal.name);
        Animal.mm();
    }
}

interface Animal {

    // By default, all attributes will be static and public on an interface
    String name = "Animal";

    void animalSound();
    void run();

    default void methodC() {
        System.out.println("Interface default method");
    }

    static void mm() {
        System.out.println("Interface static method");
    }
}

class Cat implements Animal {
    public void animalSound() {
        System.out.println("Meow...");
    }
    public void run() {
        System.out.println("Cat runs");
    }
}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof...");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }

    public void walking() {
        System.out.println("Dog is walking");
    }
}