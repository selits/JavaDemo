package learning.day04;

public class WhileLoop {
    public static void main(String[] args) {

        boolean isRaining = false;
        while (isRaining) {
            System.out.println("Don't go outside");
        }


        // Fibonacci => , 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
        int f = 1;
        int s = 1;
        int sumOfPrevious = f + s;
        StringBuilder res = new StringBuilder("1, 1, ");
        while (sumOfPrevious < 100) {
            f = s;
            s = sumOfPrevious;
            res.append(sumOfPrevious).append(", ");
            sumOfPrevious = f + s;
        }
        System.out.println(res.substring(0, res.length()-2));


//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        // while version of the for above
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }


    }
}
