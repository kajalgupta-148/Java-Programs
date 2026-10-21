import java.util.ArrayList;

public class ArrayListDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Ram");
        names.add("Raju");
        names.add("Shyam");

        System.out.println("Duplicates are allowed: " + names);
        System.out.println("First index of Ram: " + names.indexOf("Ram"));
        System.out.println("Last index of Ram: " + names.lastIndexOf("Ram"));
    }
}
