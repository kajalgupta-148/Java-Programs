import java.util.LinkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Raju");

        System.out.println("Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\\nUsing enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
