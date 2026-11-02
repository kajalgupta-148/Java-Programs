import java.util.LinkedHashSet;
public class LinkedHashSetMethods {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple"); fruits.add("Mango"); fruits.add("Banana");
        System.out.println("Fruits: " + fruits);
        System.out.println("Contains Mango: " + fruits.contains("Mango"));
        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);
        for (String fruit : fruits) System.out.println(fruit);
    }
}
