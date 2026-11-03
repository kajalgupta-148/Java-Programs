
import java.util.HashMap;
import java.util.Map;

public class MapRemove {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        map.remove(2);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
