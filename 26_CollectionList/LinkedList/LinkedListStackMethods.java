import java.util.LinkedList;

public class LinkedListStackMethods {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
