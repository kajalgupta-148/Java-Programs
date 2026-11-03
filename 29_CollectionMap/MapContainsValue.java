
import java.util.HashMap;
import java.util.Map;

public class MapContainsValue {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.containsValue("Java"));
        System.out.println(map.containsValue("C++"));
    }
}
