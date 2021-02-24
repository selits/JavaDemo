package learning.day10_oop;

public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.baby();
        obj.super_();
        obj.duper();
    }
}

class A {

    static {
        System.out.println("Duper Class");
    }

    public void duper() {
        System.out.println("Duper");
    }
}

class B extends A {

    static {
        System.out.println("Super Class");
    }

    public void super_() {
        System.out.println("Super");
    }
}

class C extends B {

    static {
        System.out.println("Baby Class");
    }

    public void baby() {
        System.out.println("Baby");
    }
}