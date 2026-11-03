
import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());
    }
}

