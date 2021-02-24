package learning.day05;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //    write a method that can remove duplicates from the string and prints out the
        //    result
        //
        //    Ex: RemoveDuplicates("aabbcccccddddaaa")
        //    output: abcd

        String word = "aabbcccccddddaaa";
        char[] letters = word.toCharArray(); // [a, a, b, b, c, c, c, c, c, d, d, d, d, a, a, a]

        System.out.println(Arrays.toString(letters));

        StringBuilder result = new StringBuilder();

        for( char letter: letters ) {
            if(!result.toString().contains(letter + "")) {
                result.append(letter);
            }
        }

        System.out.println(result);

        int nums[] = {1,2,3,4,5};
        SecondMax.printSecondMax(nums);
    }
}
