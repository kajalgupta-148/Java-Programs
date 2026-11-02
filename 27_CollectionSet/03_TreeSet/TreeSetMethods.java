import java.util.TreeSet;
public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int n : new int[]{10, 20, 30, 40, 50}) numbers.add(n);
        System.out.println("Set: " + numbers);
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Floor of 35: " + numbers.floor(35));
        System.out.println("Ceiling of 35: " + numbers.ceiling(35));
        numbers.remove(20);
        System.out.println("After remove: " + numbers);
    }
}
