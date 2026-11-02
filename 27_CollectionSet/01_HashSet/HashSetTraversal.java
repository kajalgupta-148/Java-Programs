import java.util.HashSet;
public class HashSetTraversal {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ram"); names.add("Shyam"); names.add("Raju");
        // HashSet does not guarantee iteration order.
        for (String name : names) System.out.println(name);
    }
}
