import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Contains 20: " + pq.contains(20));
        System.out.println("Size: " + pq.size());
        System.out.println("Poll: " + pq.poll());
        System.out.println("Remove: " + pq.remove());
        System.out.println("Remaining: " + pq);
        pq.clear();
        System.out.println("After clear: " + pq);
    }
}
