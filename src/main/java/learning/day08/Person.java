package learning.day08;

public class Person {
    // Class is like a blueprint
    // Instance Fields: name, age, eye-color, ssn
    // Instance Methods: greet, sayName, run, talk
    // static fields (class fields)

    public static int count; // shared among all instances
    public String name;
    public int age;
    public String eyeColor;
    private int ssn;
    public int money;

    public Person() {
        // default constructor
        count++;
        money = 10000;
    }

    // Second constructor, (Overloading constructor)
    public Person(String name, int age, String eyeColor, int ssn, int amountOfMoney) {
        this(name, age, eyeColor);
        this.ssn = ssn;
        this.money = amountOfMoney;
    }

    public Person(String name, int age, String eyeColor) {
        this();
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.ssn = ssn;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    public void sayName() {
        System.out.println("My name is " + this.name + ".");
    }

    public void sayAge() {
        System.out.println("I'm " + this.age + " years old.");
    }

    public void send(Person anotherPerson, int amount) {
        // 10 += amount
        if(this == anotherPerson) {
            System.out.println("Can't send money to self");
        } else {
            if(this.money > amount) {
                anotherPerson.money += amount;
                this.money -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "John";
        p2.name = "Jake";
        p1.age = 20;
        p1.eyeColor = "Brown";
        p1.ssn = 123456789;

        p1.greet();
        p1.sayName();
        p2.sayName();

        p1.sayAge();

        Person p3 = new Person();
        System.out.println(Person.count);

        Person p4 = new Person("Gary", 25, "Green", 987654321, 500000);
        p4.sayName();
        Person p5 = new Person("Bagtyyar", 20, "Brown");
        p5.sayName();

        p4.send(p5, 200000);

        System.out.println(Person.count);

        System.out.println(p5.money);
        System.out.println(p4.money);

    }
}


class Apple {
    public int size;
    public String color;

    public Apple(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public static void main(String[] args) {
        Apple greenApple = new Apple(4, "green");
        Apple yellowApple = new Apple(5, "yellow");

        System.out.println(greenApple.color);
        System.out.println(greenApple.size);
    }
}