package learning.day08;

public class Dog {

    // dog class
    // Name, Breed, Size, Age, Gender, Food Type
    // actions: eat, sleep, bark, play
    //

    public String name, breed, gender, foodType;
    public int size, age;


    public Dog(String name, String breed, String gender, String foodType, int size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.foodType = foodType;
        this.size = size;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void getInfo() {
        System.out.println(
                "Name: " + this.name +
                "\nBreed: " + this.breed +
                "\nGender: " + this.gender +
                "\nFood Type: " + this.foodType +
                "\nSize: " + this.size +
                "\nAge: " + this.age
        );
    }

    public String toString() {
        return "Dog{" +
                "Name='" + name + '\'' +
                ", Breed='" + breed + '\'' +
                ", Gender='" + gender + '\'' +
                ", Food Type=" + foodType +
                ", Size=" + size +
                ", Age=" + age +
                '}';
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", "Corgi", "Male", "Dog", 25, 7);
        Dog d2 = new Dog("Ashoka", "Doxin", "Female", "Any", 21, 8);

//        System.out.println(d1.name);
//        System.out.println(d1.breed);
//        System.out.println(d1.age);

        d1.getInfo();
        System.out.println("-----------------------------");
        d2.getInfo();
        System.out.println(d1);
        d1.eat();
        d2.eat();

    }
}
