import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDescending {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Kajal"); names.add("Aman"); names.add("Neha"); names.add("Ravi");
        System.out.println("Ascending: " + names);
        System.out.println("Descending: " + names.descendingSet());
        Iterator<String> it = names.descendingIterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
