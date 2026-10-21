import java.util.LinkedList;

public class LinkedListDuplicates {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Ram");
        names.add("Raju");

        System.out.println("Duplicates are allowed: " + names);
        System.out.println("First index of Ram: " + names.indexOf("Ram"));
        System.out.println("Last index of Ram: " + names.lastIndexOf("Ram"));
    }
}
