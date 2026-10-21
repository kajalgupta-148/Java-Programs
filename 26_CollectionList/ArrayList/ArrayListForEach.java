import java.util.ArrayList;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        names.forEach(name -> System.out.println(name));
    }
}
