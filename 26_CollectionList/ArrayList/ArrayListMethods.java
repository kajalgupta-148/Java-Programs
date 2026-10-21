import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Initially empty: " + list.isEmpty());

        list.add("Lucknow");
        list.add("Agra");
        list.add("Mathura");
        list.add(1, "Kanpur");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains Agra: " + list.contains("Agra"));
        System.out.println("Index of Mathura: " + list.indexOf("Mathura"));
        System.out.println("Element at index 0: " + list.get(0));

        list.set(0, "Delhi");
        System.out.println("After set: " + list);

        list.remove("Agra");
        System.out.println("After removing Agra: " + list);
        System.out.println("Is empty now: " + list.isEmpty());

        list.clear();
        System.out.println("After clear: " + list);
    }
}
