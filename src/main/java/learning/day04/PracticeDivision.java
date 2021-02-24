package learning.day04;

public class PracticeDivision {
    public static void main(String[] args) {
        int dividend = 51;
        int divisor = 10;
        int quotient = 0;

        while(dividend > 0 && dividend >= divisor) {
            quotient++;
            dividend = dividend - divisor;
        }

        System.out.println(quotient);
    }
}
