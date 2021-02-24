package learning.day08;

import java.util.ArrayList;
import java.util.Arrays;

public class Average {

    public int n1, n2, n3;

    public Average(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void printAvg() {
        double avg = (n1 + n2 + n3) / 3.0;
        System.out.printf("Average of %s, %s, and %s is %s\n", n1, n2, n3, avg);
    }
}


class AvgTester {
    public static void main(String[] args) {
        Average avFinder = new Average(10,20,30);

        avFinder.printAvg();

        AverageV2 obj = new AverageV2(1,2,3,4,5,6,7,8,9,10);
        obj.printAvg();
    }
}

class AverageV2 {

    ArrayList<Integer> numbers;

    public AverageV2(Integer ...nums) {
            numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(nums));
    }

    public void printAvg() {
        double sum = 0;
        int size = numbers.size();

        for (Integer e: numbers) {
            sum += e;
        }

        double avg = sum/size;
        System.out.println("Average of " + numbers + " is " + avg);
    }
}