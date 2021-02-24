package learning.day05;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        String classes[] = { "PE", "Math", "Eng", "Science", "Robotics" };

        for (String each: classes) {
            System.out.println(each);
        }

        System.out.println("----------------------------");

        // Matrix - Multi dimensional arrays
                            // 0        1           2
        int numPairs[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9} };
        System.out.println("Element 1: " + numPairs[0][0]);
        System.out.println("Element 8: " + numPairs[2][2]);
        System.out.println(Arrays.toString(numPairs[1]));
        System.out.println(numPairs[2].length); // 4
        System.out.println(numPairs.length); // 3

        // Print out with for each
        // [1,2]
        // [3,4,5]
        // [6,7,8,9]

        for( int[] each: numPairs) {
            System.out.println(Arrays.toString(each));
        }

        int[][] array2 = new int[3][2]; // { {a,b}, {c,d}, {e,f} }
        array2[0][0] = 1;
        array2[2][1] = 100;
        array2[2][0] = 5;
        System.out.println(Arrays.deepToString(array2));
    }
}
