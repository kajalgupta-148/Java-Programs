import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        String[] array = names.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
