package learning.day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] names = { "John", "Eric", "Sam" };
        int[] postiveEvensTill10 = {2, 4, 6, 8,};
        String weekDays [] = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41};

        // Reading from Array
        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);

        int lastPrime = primes[primes.length -1 ];
        System.out.println(lastPrime);

        // Modify elements in the Array
        names[0] = "Gary";
        System.out.println(Arrays.toString(names));

        // Conclusion: Can't add or delete elements from an Array, the length is fixed.

        // Print square of each element from primes array to the console
        // primes[0] = primes[0] * primes[0];
        // primes[1] = primes[1] * primes[1];
        // primes[2] = primes[2] * primes[2];

        // Use for loop instead of above
//        for (int i = 0; i < primes.length; i++) {
//            primes[i] = primes[i] * primes[i];
//        }
//
//        // use a for loop to square all
//        System.out.println("Squaring primes: " + Arrays.toString(primes));


        // Ask 5 names from a user then put them in the namesArray
//        String[] namesArray = new String[5];

//        for (int i = 0; i < 5; i++) {
//            System.out.print("Please enter a name " + (i + 1) + ": ");
//            namesArray[i] = new Scanner(System.in).nextLine();
//        }
//        System.out.println(Arrays.toString(namesArray));
//        System.out.println(namesArray.length);
//
//
//        namesArray = new String[10];
//        System.out.println(Arrays.toString(namesArray)); // All elements will be null
//
//        System.out.println(10/2); // 5


        // Ask user 5 names and store the names with only 3 characters in an array (only keeps names with 3
        // characters) array size of 5

        String[] namesArrayTest = new String[5];
        int ind = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a name " + (i + 1) + ": ");
            String name = new Scanner(System.in).nextLine();
            if(name.length() == 3) {
                namesArrayTest[ind] = name;
                ind++;
            }
        }
        System.out.println(Arrays.toString(namesArrayTest));

    }
}
