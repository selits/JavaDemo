package learning.day13_abstraction;

public class AbstractPractice {

    public static void main(String[] args) {

    }
}

abstract class A {
    abstract void m1();
    abstract int m2();
    void m3() {

    }

}

abstract class B extends A {
    int m2() {
        return 0;
    }

    @Override
    abstract void m3();
}

class C extends B {
    void m3() {

    }

    void m1() {

    }

}