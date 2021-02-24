package learning.day12_overloading_overriding;

public class Overloading {
    public static void main(String[] args) {
        add(1,2); // -> 3
        add(1,2,3); // -> 6
        add(1.2, 2.5); // -> 3.7
        add(9.9, 4); // -> 13.9
        add(9, 4.7); // -> 13.7
    }

    /*
    1. Number of arguments
    2. Changing argument types
    3. Sequence of Data type of parameters

    Invalid:
        -- Changing return type will not work
        public static void add(int a, int b);
        public static int add(int a, int b);

        Note: Overloading occurs in the same class
            Sometimes it's called STATIC binding (compile time)
     */

    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    // Overloading method
    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void add(double a, double b) {
        System.out.println(a+b);
    }

    public static void add(double a, int b) {
        System.out.println(a+b);
    }

    public static void add(int a, double b) {
        System.out.println(a+b);
    }
}
