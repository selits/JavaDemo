package learning.day16_collections_interface;

import java.util.*;

public class ListInterface {
    /*
     * List(Interface)
     * ArrayList, LinkedList, Vector, Stack
     */

    public static void main(String[] args) {
        List ls = new ArrayList(); // Reading is faster
        List ls2 = new LinkedList(); // Add and remove is faster
        List ls3 = new Vector();
        List ls4 = new Stack();

        // ArrayList (Class)
        // Ordered - index
        // Better for storing and accessing data
        // Accepts duplicates
        ls.add(1);
        ls.add(100);
        ls.add(100);
        System.out.println(ls);

        ls2.add("Hello");
        ls2.add("World");
        ls2.add("Apple");
        System.out.println(ls2);


        // Syncronized (Thread safe but slower)
        Stack<String> cards = new Stack<>(); // LIFO - Last In First Out - Push / Pop

        cards.push("Queen of Hearts");
        cards.push("Jack of Spades");
        cards.push("King of Diamonds");

        cards.pop();

        System.out.println(cards);
    }
}
