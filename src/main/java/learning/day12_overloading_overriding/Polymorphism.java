package learning.day12_overloading_overriding;

public class Polymorphism {
    // Object can behave in many forms

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        myAnimal = new Dog();
        myAnimal.animalSound();

        myAnimal = new Cat();
        myAnimal.animalSound();

    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound...");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The DOG makes a sound...");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The CAT makes a sound...");
    }
}