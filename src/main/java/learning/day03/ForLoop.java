package learning.day03;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }

        /**
         * for(init; condition; iterator) { code to be repeated until condition becomes false }
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Write a program to calculate the sum of first 10 natural numbers.
        int num = 10, count, total = 0;

        for( count = 1; count <= num; count++ ) {
            total = total + count;
        }

        System.out.println("Sum of first 10 natural numbers is: " + total);

        // or
        int sum = 0;
        for(int i = 1; i < 11; i++ ) {
            sum += i; // Same as "sum = sum + i;" || init, condition, body, iterator, condition, body, iterator...
        }
        System.out.println("Sum of first 10 natural numbers is " + sum);

        // Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        // 5
        // 1 * 5 = 5
        // 2 * 5 = 10
        // ...
        // 10 *5 = 50

        int userNum = 5;
        for(int i = 1; i < 11; i++) {
            int res = userNum * i;
            System.out.println(i + " * " + userNum + " = " + res);
        }

        // Print out all odd numbers until 20
        int countAgain = 1;
        for (int i = 1; i <= 20; i++) {
            if(i%2 == 1) {
                if (countAgain == 1) System.out.println(countAgain + "st: " + i);
                else if (countAgain == 2) System.out.println(countAgain + "nd: " + i);
                else if (countAgain == 3) System.out.println(countAgain + "rd: " + i);
                else System.out.println(countAgain + "th: " + i);
                countAgain++;
            }
        }

        // Fibonacci => , 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
        int f = 1;
        int s = 1;
        int sumOfPrevious = f + s;
        StringBuilder res = new StringBuilder("1, 1, ");
        for ( ; sumOfPrevious < 100 ; ) {
            f = s;
            s = sumOfPrevious;
            res.append(sumOfPrevious).append(", ");
            sumOfPrevious = f + s;
        }
        System.out.println(res.substring(0, res.length()-2));


        // Write a program to find the factorial value of any number entered through the keyboard.
        // Factorial 10 => 1 * 2 * 3 ... * 10 = Result

        Scanner scan = new Scanner(System.in);
        int numFac; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        numFac = scan.nextInt();

        for(int i=1; i<=numFac; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);

        // Same thing as above but from Bag?

        System.out.print("Enter number : ");
        int numb = scan.nextInt();
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println(product);
        /*
            1   Product
            1   1
            2   2
            3   6
            4   24
            ...
            10 39916800
         */

        // test
        System.out.println("Please enter a number: ");
        int numb2 = scan.nextInt();
        int sums = 0;
        StringBuilder numbersAddition = new StringBuilder();

        for (int i = 1; i <= numb2; i++) {
            sums += i;
            if(i !=numb) numbersAddition.append(i).append(" + ");
            else numbersAddition.append(i);

        }

        System.out.println(numbersAddition + " = " + sums);

    }
}
