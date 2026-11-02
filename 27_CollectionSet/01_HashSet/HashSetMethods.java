import java.util.HashSet;
public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> places = new HashSet<>();
        places.add("Lucknow"); places.add("Agra"); places.add("Kanpur");
        System.out.println("Set: " + places);
        System.out.println("Size: " + places.size());
        System.out.println("Is empty: " + places.isEmpty());
        System.out.println("Contains Agra: " + places.contains("Agra"));
        places.remove("Agra");
        System.out.println("After remove: " + places);
        places.clear();
        System.out.println("After clear: " + places);
    }
}
