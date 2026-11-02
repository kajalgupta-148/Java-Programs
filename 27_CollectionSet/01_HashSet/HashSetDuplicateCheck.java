import java.util.HashSet;
public class HashSetDuplicateCheck {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(20));
        System.out.println(numbers.add(10)); // false: duplicate
        System.out.println("Unique numbers: " + numbers);
    }
}
