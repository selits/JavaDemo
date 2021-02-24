package learning.day15_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DemoExceptions {
    static ArrayList<String> myList;

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Hello");

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            // System.out.println(e);
            System.out.println("Error: Unable do divide by zero.");
        } finally {
            System.out.println("Finally is executed no matter what");
        }

        System.out.println("There!");

        // Checked exceptions
        // Thread.sleep(2000); (made into try catch instead)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1 second over");

        try {
            FileReader fr = new FileReader("sample.txt");

            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Unchecked exception - NullPointerExeption
        // myList.add("One");
        try {
            myList.add("One");
        } catch (NullPointerException e) {
            System.out.println("'One' couldn't be added to the list");
        }
    }
}
