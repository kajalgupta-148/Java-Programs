import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class QueueTraversal {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Red");
        queue.offer("Green");
        queue.offer("Blue");
        System.out.println("Using for-each:");
        for (String color : queue) System.out.println(color);
        System.out.println("Using Iterator:");
        Iterator<String> it = queue.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
