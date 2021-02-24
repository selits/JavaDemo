package learning.day10_oop;

public class Super {

    String name = "Superman";

    public void m1() {
        System.out.println("Hello");
    }

    public void print() {
        System.out.println("I am a super class");
    }
}

class Sub2 extends Super {

}

class Sub extends Super {

    public void m2() {
        System.out.println("Hello2");
    }

    public void print() {
        System.out.println("I am a sub class");
    }
}

class Tester {
    public static void main(String[] args) {
    Sub ob1 = new Sub();
    Sub2 ob2 = new Sub2();

    ob1.m2();
    ob1.print();
    ob1.m1();

    System.out.println(ob1.name + " from ob1");
    System.out.println(ob2.name + " from ob2");
    }
}