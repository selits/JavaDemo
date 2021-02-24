package learning.day02;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        // Write a Java program to create a simple calculator, + - * /
        // 2 4 + => 2+4=6
        // *     => 2*4=8
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Please enter an operator (+-*/): ");
        String operator = scan.next();

        switch (operator) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + ((num1+0.0) / num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
        }


    }
}
