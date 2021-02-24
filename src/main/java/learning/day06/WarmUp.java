package learning.day06;

public class WarmUp {
    public static void main(String[] args) {
        /* 5. Write a Java method to count all words in a string. Go to the editor
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
                Expected Output:

        Number of words in the string: 9
        */

        int count = countWords("The quick brown fox jumps over the lazy dog.");
        System.out.println(count);

        /*
        Write a java method to compute the sum of digits in an integer.
        computeSum(123) => 1+2+3 = 6
        13 % 10 = 3
        5 % 10 = 5
        5/2 = 2
        13/10 = 1

        num = 123
        remainder = 123 % 10 = 3 last digit
        num = 123 / 10 = 12
        12 % 10 = 2 second digit
        num = 12 / 10 = 1
        1 % 10 = 1 first digit
        num = 1 / 10 = 0
         */

        int sumOfDigits = computeSum(123);
        System.out.println(sumOfDigits);

    }

    public static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static int computeSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }

        return sum;
    }

}
