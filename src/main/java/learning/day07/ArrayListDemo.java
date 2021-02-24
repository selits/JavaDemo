package learning.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Arrays - [], size is fixed
        // ArrayList - size can change, also helps to put similar elements in it
        // ArrayList obj = new ArrayList();
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(10);
        list.add("Hello");
        list.add(10.5);

        System.out.println(list);

        // get 3rd item in list
        System.out.println(list.get(2));

        // update 10.5 to "world"
        list.set(3, "world");
        System.out.println(list);

        ArrayList cars = new ArrayList();
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Tesla");

        // Add more than a single element
        list.addAll(List.of(1,2,3,4,5,6));
        list.addAll(0, cars);
        System.out.println(list);

        // Delete element from list
        list.remove(0); // removes first item in list
        list.remove("Tesla");
        list.remove((Integer) 5); // remove number 5 (uses casting)
        System.out.println(list);

        int a = 10; // a is a primitive type variable, no dedicated methods
        Integer b = ((Integer) a); // b is reference type variable (object), has dedicated methods

        Object[] arr = { 1, 1.2, "asd", 'a'};

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Joe");
        names.add("Jane");
        names.add("Jay");

        names.set(0, "Jacob");

        // Update last in list
        int ind = names.size() - 1;
        names.set(ind, "Joel");
        System.out.println(names);

        ArrayList<Integer> fibs = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34));

        System.out.println(fibs);
        // fibs.remove(fibs.size() -1);
        // fibs.remove((Integer) 34);
        fibs.remove(Integer.valueOf(34));
        System.out.println(fibs);
    }
}
