import java.util.LinkedList;

public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers);
    }
}
