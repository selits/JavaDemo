package learning.day06;

public class Practice {
    public static void main(String[] args) {
        // oddOrEven(10) -> 10 is even
        // oddOrEven(5) -> 5 is odd

        oddOrEven(10);
        oddOrEven(5);
        oddOrEven(574);

        // Create a method that accepts array and will print only odd numbers from the array
        int[] numbers = {1,2,3,4,5,6};
        printOdds(numbers); // => 1,3,5
        // isOdd(5) => if odd say true, if not say false

        System.out.println(isOdd(7));
        System.out.println(isOdd(4));

        String[] names = {"kim", "jim", "tom", "Mike", "Nina", "Bagtyyar", "yusuf", "Patrick", "Luis"};
        System.out.println(longestName(names));
    }


    public static void oddOrEven(int number) {
        if(number % 2 == 0) System.out.println(number + " is even");
        else System.out.println(number + " is odd");
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static void printOdds(int[] numbers) {
        StringBuilder res = new StringBuilder();

        for (int each: numbers) {
            if (isOdd(each)) res.append(each).append(", ");
        }
        System.out.println(res.substring(0, res.length()-2));
    }

    // returnType = String, methodName = longestName
    public static String longestName(String[] arr) {
        String longestName = "";
        int lengthOfLongestName = 0;

        for(String name: arr) {
            if(name.length() > lengthOfLongestName) {
                longestName = name;
                lengthOfLongestName = name.length();
            }
        }

        return longestName;
    }


}
