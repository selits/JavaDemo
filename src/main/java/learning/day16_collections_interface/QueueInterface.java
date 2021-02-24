package learning.day16_collections_interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {
        // Queue Interface
        // ArrayQueue, PriorityQueue (Classes)
        // FIFO - First In First Out
        // Pop / Push

        Queue<Integer> num = new ArrayDeque<>();

        num.add(1);
        num.add(2);
        num.add(3);

        // num.poll(); // Retrieves the head and removes it from the queue
        num.peek(); // Retrieves the head but doesn't remove
        int peekNum = num.peek();

        System.out.println(num);
        System.out.println(peekNum);

    }
}
