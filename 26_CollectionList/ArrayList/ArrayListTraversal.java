import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        System.out.println("Using a for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\n Using an enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
