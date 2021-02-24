package learning.day04;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int numb = scan.nextInt();

        int product = 1;

        int i = 1;

        while(i <= numb) {
        product *= i++;
    }

        System.out.println(product);

    }
}
