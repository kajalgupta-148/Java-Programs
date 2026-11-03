
import java.util.HashMap;

public class DuplicateValue {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Java");
        map.put(3, "Python");

        System.out.println(map);
    }
}
