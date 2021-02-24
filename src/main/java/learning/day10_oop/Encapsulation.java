package learning.day10_oop;

public class Encapsulation {

    public int num1;
    protected int num2;
    int num3;
    private int num4;

    public int getNum4() {
        return num4;
    }

    public void setNum4(int newValue) {
            num4 = newValue;
    }

    public static void main(String[] args) {
        Person john = new Person();
        john.isEmployed = true;
        john.name = "John";
        // john.age = 40; // Can't use due to int being private
    }
}

class Sub3 extends Encapsulation {
    public static void main(String[] args) {
        Encapsulation ob = new Encapsulation();
        // Reading private field
        System.out.println(ob.getNum4());
        // Modify private field
        ob.setNum4(100);
        System.out.println(ob.getNum4());
    }
}

class Person {
    // Access modifiers: public, protected, default, private
    //                   world                       class
    //

    public String name;
    private int age;  // Can only use this in its own class and not other classes since it is private
    boolean isEmployed; // default
}

class Employer extends Person {

    public static void main(String[] args) {
        Employer ob = new Employer();

        // ob.age, not reachable because it's private

    }
}