package learning.day06;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String word1 = "a1b2c345d6";
        // Remove all letters => 123456

        System.out.println(removeLetters(word1));
        smallestOfThreeNums();
        averageOfNumbers();

    }

    public static String removeLetters(String word) {
        String result = "";

        char[] allChars = word.toCharArray();
        for(char each: allChars) {
            if(Character.isDigit(each)) {
                result += each;
            }
        }
        return result;

    }

    public static void smallestOfThreeNums() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int n1 = scan.nextInt();

        System.out.println("Input the second number: ");
        int n2 = scan.nextInt();

        System.out.println("Input the third number: ");
        int n3 = scan.nextInt();

        int smallest = Math.min(Math.min(n1, n2), n3);
        int greatest = Math.max(Math.max(n1, n2), n3);

        System.out.println("Smallest number is " + smallest);
        System.out.println("Greatest number is " + greatest);

    }

    public static double averageOfNumbers() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number for avg: ");
        int n1 = scan.nextInt();

        System.out.println("Input the second number for avg: ");
        int n2 = scan.nextInt();

        System.out.println("Input the third number for avg: ");
        int n3 = scan.nextInt();

        double average = (n1 + n2 + n3) / 3.0;

        // Round to 2 decimal places.
        // (int) is for casting from one type to another
        average = (int) (average * 100 + 0.005) / 100.0;

        System.out.println("The average is " + average);

        return average;
    }



}
