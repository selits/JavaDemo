package learning.day01;

public class Variables {

    public static void main(String[] args) {
        // Primitives - reference type variables -> has no related methods
        // 1. int, long, double, float, boolean,
        // 2. String, ... -> has methods
        int number = 5;
        double number2 = 5.5;
        float number3 = 5.5f;

        number = 20;
        number = number + 10;

        System.out.println(number); // 30

        // increment by 1 ++. --
        number++;
        System.out.println(number); // 31

        number--;
        System.out.println(number); // 30

        // shorthand operators ++, --, +=, -=, *=
        number += 10;
        System.out.println(++number); // 41
        System.out.println(number--); // 41
        System.out.println(number); // 40

        System.out.println(10+5*3); // 25

        // int division
        System.out.println(25/6); // 4

        // double division
        System.out.println(25./6); // 4.166666666666667
        System.out.println(25/6.0); // 4.166666666666667
        System.out.println(3/2 + 0.5); // 1.5

        System.out.println(25%20); // get remainder which is 5

        char firstLetter = 'a';
        char secondLetter = 'b';

        System.out.println(firstLetter+secondLetter); // gives 195 cause adding ASCII value
        System.out.println(firstLetter); // a

        String name = "Gary";
        String lastName = "Hill";
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        char first = name.charAt(0);
        String initials = name.charAt(0) + "" + lastName.charAt(0);
        System.out.println(initials);

        int len = name.length();
        System.out.println(len); // 4
        System.out.println(len - 1); // 3

        char lastLetterFromMyName = name.charAt(len-1);
        System.out.println(lastLetterFromMyName);

        String city = "Buffalo New York";
        String abc = city.substring(0,7);
        System.out.println(abc);

        System.out.println(city.substring(8)); // New York



    }
}
