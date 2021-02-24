package learning.day04;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        // Write a program to keep asking for a number until you enter a negative number. At the end, print the sum of all entered numbers.
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        while (number > -1) {
            sum += number;
            System.out.print("Enter another number: ");
            number = scan.nextInt();
        }
        sum += number;

        System.out.println("Total is: " + sum);

    }
}
