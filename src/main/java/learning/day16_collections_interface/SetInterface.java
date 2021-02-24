package learning.day16_collections_interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {
        // Set (Interface)
        // SortedSet(I) extends Set (I)
        // TreeSet (C) implements SortedSet (I)
        // HashSet and LinkedHashedSet (C) implements Set (I)
        // NO DUPLICATES

        Set<String> names = new HashSet<>();

        // Order is not maintained, we can't predict the order
        // No duplicates
        names.add("Gary");
        names.add("Jack Johnson");
        names.add("Bagtyyar");
        boolean isAdded = names.add("Gary");
        names.add("Mystery");
        names.add("Hello");

        System.out.println(names);
        System.out.println("Second Gary is added: " + isAdded);

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(5);
        boolean isSuccessful = numbers.add(1);

        System.out.println(numbers);
        System.out.println(isSuccessful);


        // Elements are sorted
        Set<String> cities = new TreeSet<>();
        cities.add("San Diego");
        cities.add("Pittsburgh");
        cities.add("Buffalo");
        cities.add("100");
        cities.add("99");
        cities.add("0001");

        System.out.println(cities);
    }
}

class Practice {
    // Write a method that compares two tree sets
    // First Tree set: [Black, Green, Red, White]
    // Second Tree set: [Black, Orange, Pink, Red]
    public static void main(String[] args) {
        Set<String> colors1 = new TreeSet<>();
        colors1.add("Black");
        colors1.add("Green");
        colors1.add("Red");
        colors1.add("White");

        Set<String> colors2 = new TreeSet<>();
        colors2.add("Black");
        colors2.add("White");
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");

        boolean isEqual = compareTreeSets(colors1, colors2);
        System.out.println(isEqual);
    }

    private static boolean compareTreeSets(Set<String> first, Set<String> second) {
        if(first.size() != second.size()) return false;

        for( String each: first ) {
            if(second.add(each)) return false;
        }
        return true;

    }
}