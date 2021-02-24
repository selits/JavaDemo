package learning.day02;

public class SwitchStatements {

    public static void main(String[] args) {
        String name = "Mary";

        if(name.equals("Mary")) System.out.println("It's Mary");
        else if(name.equals("Jane")) System.out.println("It's Jane");
        else if(name.equals("John")) System.out.println("It's John");
        else System.out.println("Unknown");

        switch (name) {
            case "Mary":
                System.out.println("It's Mary");
                break;
            case "Jane":
                System.out.println("It's Jane");
                break;
            case "John":
                System.out.println("It's John");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        // 1. Write a Java program to print day of week name using switch case.
        String day = "Thursday";

        switch(day) {
            case "Sunday":
                System.out.println("It's Sunday!");
                break;
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "Thursday":
                System.out.println("It's Thursday!");
                break;
            case "Friday":
                System.out.println("It's Friday!");
                break;
            case "Saturday":
                System.out.println("It's Saturday!");
                break;
        }

        // 2. Java program to check vowel or consonant using switch case.

        char letter = 'p';

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is a vowel");
                break;
            default:
                System.out.println(letter + " is a consonant");
        }

    }
}
