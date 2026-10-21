import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("Numbers: " + numbers);
        sc.close();
    }
}
