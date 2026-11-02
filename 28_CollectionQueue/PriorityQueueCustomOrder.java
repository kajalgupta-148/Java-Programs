import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueCustomOrder {
    public static void main(String[] args) {
        // Reverse order: largest number gets highest priority
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);
        System.out.println("Descending priority order:");
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }
}
