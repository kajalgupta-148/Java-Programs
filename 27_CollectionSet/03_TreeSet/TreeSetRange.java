import java.util.TreeSet;
public class TreeSetRange {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int n : new int[]{10, 20, 30, 40, 50, 60}) numbers.add(n);
        System.out.println("All: " + numbers);
        System.out.println("Less than 40: " + numbers.headSet(40));
        System.out.println("40 and above: " + numbers.tailSet(40));
        System.out.println("20 to 50 inclusive: " + numbers.subSet(20, true, 50, true));
    }
}
