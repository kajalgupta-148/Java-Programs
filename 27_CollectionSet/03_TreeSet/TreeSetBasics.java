import java.util.TreeSet;
public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40); numbers.add(10); numbers.add(30); numbers.add(20); numbers.add(10);
        System.out.println(numbers); // Sorted, duplicates ignored
    }
}
