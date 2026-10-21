import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("Java");
        original.add("Kotlin");
        original.add("Python");

        ArrayList<String> copied = new ArrayList<>(original);
        System.out.println("Original: " + original);
        System.out.println("Copied: " + copied);

        copied.add("C++");
        System.out.println("Updated copy: " + copied);
        System.out.println("Original remains unchanged: " + original);
    }
}
