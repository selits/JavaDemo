package learning.day09_Practice_Classes;

class Animal {
    private String name;
    private int age;

    public Animal() {

    }

    // Define 2 args constructor that initializes instance variables.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInHumanYears() {
        if(age <= 2) return age * 11;
        else return 22 + (age - 2) *5;
    }

    private void m1() {
        System.out.println("I am an animal!");
    }


}

public class Dog extends Animal{

    String breed;
    int years;

    // Default constructor in this class but it's implicitly defined
    public Dog(String name, int age, String breed) {
        super(name, age); // Calling super class constructor to initialize name and age
        this.years = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nBreed: " + breed + "\nAge in calendar years: " + years +
                "\nAge in dog years: " + getAgeInHumanYears();
    }

    public static void main(String[] args) {
        Animal myDog = new Dog("Rex", 3, "Corgi");
        Animal myDog2 = new Dog("Jones", 8, "Bulldog");
        System.out.println(myDog);
        System.out.println(myDog2);
    }

    /**
     * Write an abstract class Animal that contains 2 instance variables: name and age.
     * Provide getters and setters for these variables. Add an abstract method getAgeInHumanYears() that returns int.
     * Define 2 args constructor that initializes instance variables.
     *
     * Write a class Dog that extends the Animal class. Define 2 instance variables for this class: breed (String) and humanYears (int).
     *
     * Add a constructor that accepts three String parameters. The value of the first is used to initialize the value of name, the value of the second is used to initialize age and the value of the third is used to initialize breed.
     *
     * User super() to call parent constructor.
     *
     * Override toString() method, so it will display Dog info as in the example below:
     *
     * Name: name
     * Breed: breed
     * Age in calendar years: years
     * Age in human years: humanYears
     *
     * Use \n to print a text from a new line
     *
     * Also, implement getAgeInHumanYears method, so It will convert dogs age into humans age as follows:
     *
     * if the dog's age is less or equals to 2, multiple age by 11;
     * otherwise, human years is equals to: 22 + ((age-2) * 5);
     *
     * Define an equals method for the Dog class that returns true if the dog’s name, age, and breed match the same variables for the other object that is being compared.
     */


}
