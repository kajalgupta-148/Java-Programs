import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        System.out.println("Before update: " + names);
        names.set(1, "Mohan");
        System.out.println("After updating index 1: " + names);
    }
}
