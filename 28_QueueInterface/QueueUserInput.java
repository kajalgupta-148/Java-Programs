import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            queue.offer(sc.nextInt());
        }
        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        sc.close();
    }
}
