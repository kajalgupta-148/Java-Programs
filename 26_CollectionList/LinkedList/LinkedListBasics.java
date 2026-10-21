import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
        list.add("Shyam");
        list.add("Raju");

        System.out.println("LinkedList: " + list);
        System.out.println("Size: " + list.size());
    }
}
