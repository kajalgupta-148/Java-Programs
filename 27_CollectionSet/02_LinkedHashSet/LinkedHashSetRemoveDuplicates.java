import java.util.ArrayList;
import java.util.LinkedHashSet;
public class LinkedHashSetRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java"); list.add("Python"); list.add("Java"); list.add("Kotlin"); list.add("Python");
        LinkedHashSet<String> unique = new LinkedHashSet<>(list);
        System.out.println("Original list: " + list);
        System.out.println("Unique values in original order: " + unique);
    }
}
