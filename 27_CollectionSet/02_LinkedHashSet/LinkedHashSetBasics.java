import java.util.LinkedHashSet;
public class LinkedHashSetBasics {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Ram"); names.add("Shyam"); names.add("Raju"); names.add("Ram");
        System.out.println(names); // Unique values, insertion order maintained
    }
}
