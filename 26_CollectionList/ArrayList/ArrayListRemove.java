import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");
        names.add("Mohan");

        System.out.println("Original list: " + names);
        names.remove("Shyam");       // Remove by object
        System.out.println("After remove(object): " + names);

        names.remove(0);             // Remove by index
        System.out.println("After remove(index): " + names);

        names.clear();               // Remove all elements
        System.out.println("After clear(): " + names);
    }
}
