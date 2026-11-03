
import java.util.HashMap;

public class DuplicateKey {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "Kotlin");

        System.out.println(map);
    }
}
