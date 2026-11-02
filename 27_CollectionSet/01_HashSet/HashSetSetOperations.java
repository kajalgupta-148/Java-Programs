import java.util.HashSet;
public class HashSetSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1); a.add(2); a.add(3);
        HashSet<Integer> b = new HashSet<>();
        b.add(3); b.add(4); b.add(5);
        HashSet<Integer> union = new HashSet<>(a); union.addAll(b);
        HashSet<Integer> intersection = new HashSet<>(a); intersection.retainAll(b);
        HashSet<Integer> difference = new HashSet<>(a); difference.removeAll(b);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("A - B: " + difference);
    }
}
