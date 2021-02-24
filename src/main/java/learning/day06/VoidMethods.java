package learning.day06;

public class VoidMethods {
    public static void main(String[] args) {
        // Method - it's a block of custom commands
        // Create a Method that prints "Hello" 10 times
        printHello();

        greet("Gary");
        greet("Bagtyyar");
        greet("Jim");

        // Create a method that adds up numbers
        add2Nums(2,3);

        add(1,2);
        add(1,2,3,4);
        add(1,2,3,4,5,6,7,8,9,10);

        capLetter("poTatoes");
        capFullName("gary hill");

    }

    public static void printHello() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void add2Nums(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total: " + total);
    }

    public static void add(int ...nums) {
        int sum = 0;
        for (int each: nums) {
            sum += each;
        }
        System.out.println("Total: " + sum);
    }

    public static String capLetter(String word) {
        String firstLetter = word.substring(0,1).toUpperCase();
        String otherLetters = word.substring(1).toLowerCase();
//        System.out.println(firstLetter + otherLetters);
        return firstLetter + otherLetters;
    }

    // gary hill
    // 012345678
    public static void capFullName(String fullName) {
        int indexOfSpaceChar = fullName.indexOf(' ');
        String firstName = fullName.substring(0, indexOfSpaceChar);
        String lastName = fullName.substring(indexOfSpaceChar+1);

        System.out.println(capLetter(firstName) + " " + capLetter(lastName));
    }


}
