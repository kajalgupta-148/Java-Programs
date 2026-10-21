import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDescendingIterator {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        Iterator<String> iterator = names.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
