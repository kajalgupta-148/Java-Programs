
import java.util.HashMap;
import java.util.Map;

public class MapGet {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(5));
    }
}
