package learning.day02;

import learning.day05.SecondMax;

public class Practice {

    public static void main(String[] args) {
        // Declare three int variables and initialize with some random numbers
        // if n1 and n2 are equal
        // if n2 and n3 are equal --> n2 and n3 are equal
        // if n3 and n1 are equal --> n3 and n1 are equal, also if n3 is 10, i want to square number
        // if all equal --> all equal
        // if none of them are equal --> none of them are equal

        int n1 = 20;
        int n2 = 50;
        int n3 = 20;

        if(n1 == n2 && n3 != n2){
            System.out.println("n1 and n2 are equal");
        } else if(n2 == n3 && n2 != n1) {
            System.out.println("n2 and n3 are equal");
        } else if(n3 == n1 && n2 != n1) {
            System.out.println("n3 and n1 are equal");
            if(n3 == 10) System.out.println(Math.pow(n3, 2));
        } else if(n1 == n2 && n2 == n3) {
            System.out.println("all equal");
        } else {
            System.out.println("none are equal");
        }

        SecondMax.printSecondMax(new int[] {1,2,3,4,5,6,7,8});
    }
}
