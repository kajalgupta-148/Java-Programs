import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Kajal");
        pq.add("Riya");
        pq.add("Chintu");
        pq.add("Anu");
        System.out.println("Priority Queue: " + pq);
        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) System.out.println(pq.poll());
    }
}
