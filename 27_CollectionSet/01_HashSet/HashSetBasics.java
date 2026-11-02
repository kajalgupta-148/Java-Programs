import java.util.HashSet;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> places = new HashSet<>();
        places.add("Lucknow"); places.add("Agra"); places.add("Kanpur"); places.add("Lucknow");
        System.out.println("HashSet: " + places);
        System.out.println("Size: " + places.size());
    }
}
