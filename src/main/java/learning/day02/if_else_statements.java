package learning.day02;

import java.util.Scanner;

public class if_else_statements {

    public static void main(String[] args) {
        //className obj = new Scanner is for creating objects or instances
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int myNum = scan.nextInt();

        System.out.println("My Number is " + myNum);

        // Let's write if statement to check my number is positive or not
        // if(condition) { stuff }
        if(myNum > 0) {
            System.out.println("potatoes");
            System.out.println("My number is positive");
        } else if (myNum < 0) {
            System.out.println("My number is negative");
        } else {
            System.out.println("My number is zero");
        }

        // A 80 or more, B 60-80, C 50-60, myGrade = 70
        System.out.println("Enter your grade: ");
        int myGrade = scan.nextInt();

        if(myGrade < 0 || myGrade > 100) System.out.println("Invalid grade");
        else if(myGrade >= 80) System.out.println("Yay, I got an A");
        else if(myGrade >= 60) System.out.println("I did well");
        else if(myGrade >= 50) System.out.println("I need to work harder");
        else System.out.println("I did poorly");


        // && -> operator, || -> or operator, ! -> not
        boolean isRaining = false;
        boolean amIHungry = true;
        // If it's not raining and I am not hungry, I want to work
        // otherwise I want to rest
        if(!isRaining && !amIHungry) System.out.println("I want to work");
        else System.out.println("I want to rest");

        /*
            true || anything  -> true
            true && true -> true
            false && anything -> false
         */







    }
}
