package learning.day05;

public class SecondMax {
    public static void main(String[] args) {
        int numbers[] = { 23, 999, 456, 456, 675, -25, 100, 1000, 100, -1000 };
        int nums2[] = {100, 200, 300};
        printSecondMax(numbers);
        printSecondMax(nums2);
    }

    public static void printSecondMax(int[] myArray) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int number: myArray) {
            if(number > max) max = number;
            if(number < min) min =number;
        }

        System.out.println("Max number is " + max);
        System.out.println("Max number is " + min);

        int secondMax = Integer.MIN_VALUE;
        for(int each: myArray) {
            if(each > secondMax && each < max) secondMax = each;
        }

        System.out.println("Second Max is " + secondMax);

    }
}