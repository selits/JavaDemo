package learning.day11;

import learning.day10_oop.Encapsulation;

public class TestingAccessModifiers {
    public static void main(String[] args) {
        Encapsulation ob = new Encapsulation();
        ob.num1 = 10;
        // ob.num2 = 20 // Won't work because its not in the same package
    }
}
