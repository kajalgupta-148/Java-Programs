
import java.util.HashMap;
import java.util.Map;

public class MapReplace {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
    System.out.println(map);
        map.replace(1, "Kotlin");

        System.out.println(map);
    }
}
