import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
    }
}
