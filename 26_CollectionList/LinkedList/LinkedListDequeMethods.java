import java.util.LinkedList;

public class LinkedListDequeMethods {
    public static void main(String[] args) {
        LinkedList<String> deque = new LinkedList<>();

        deque.addFirst("B");
        deque.addFirst("A");
        deque.addLast("C");
        deque.addLast("D");

        System.out.println("Deque: " + deque);
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());
        System.out.println("After removals: " + deque);
    }
}
