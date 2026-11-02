import java.util.Queue;
import java.util.LinkedList;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
    }
}
