import java.util.Queue;
import java.util.LinkedList;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Mango");
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());
        System.out.println("Contains Mango: " + queue.contains("Mango"));
        System.out.println("Size: " + queue.size());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remaining: " + queue);
        queue.clear();
        System.out.println("After clear: " + queue);
    }
}
