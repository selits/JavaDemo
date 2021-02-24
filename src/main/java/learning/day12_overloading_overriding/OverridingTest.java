package learning.day12_overloading_overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();
        Super sub2 = new Sub();

        sup.greeting();
        sub.greeting();
        sub2.greeting();

        sup.eatPotato();
        sub.greetRussian();
        sub2.eatPotato();

        ((Duper) sub).greeting();
        Duper obj = (Duper) sub;
        obj.greeting2();

    }
}

class Sub extends Super {
    public void greeting() {
        System.out.println("Sub: " + "Hello!!!!!");
    }

    public void greetRussian() {
        System.out.println("Privet");
    }
}

class Super extends Duper {
    public void greeting() {
        System.out.println("Super: " + "Hello there, how are you?");
    }

    public void eatPotato() {
        System.out.println("Eating potato");
    }
}

class Duper {
    public void greeting() {
        System.out.println("I am duper greeter, hello!");
    }

    public void greeting2() {
        System.out.println("I am duper greeter, hello!");
    }
}
