import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Raju");
        names.add("Aman");
        names.add("Kajal");
        names.add("Neha");

        System.out.println("Original: " + names);
        Collections.sort(names);
        System.out.println("Ascending order: " + names);

        Collections.reverse(names);
        System.out.println("Reverse order: " + names);
    }
}
