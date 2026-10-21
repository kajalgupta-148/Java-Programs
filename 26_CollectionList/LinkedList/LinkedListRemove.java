import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original: " + list);
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);
        list.removeLast();
        System.out.println("After removeLast(): " + list);
        list.remove("B");
        System.out.println("After remove(object): " + list);
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
