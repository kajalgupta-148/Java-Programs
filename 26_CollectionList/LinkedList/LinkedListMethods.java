import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.addFirst("White");
        list.addLast("Black");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Contains Green: " + list.contains("Green"));
        System.out.println("Index of Blue: " + list.indexOf("Blue"));
        System.out.println("Is empty: " + list.isEmpty());

        list.set(1, "Yellow");
        System.out.println("After set: " + list);
    }
}
