import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> places = new LinkedList<>();

        places.add("Lucknow");
        places.add("Agra");
        places.add("Kanpur");
        places.add("Mathura");

        System.out.print("Enter a place to search: ");
        String place = sc.nextLine();

        if (places.contains(place)) {
            System.out.println("Place found at index " + places.indexOf(place));
        } else {
            System.out.println("Place not found.");
        }

        sc.close();
    }
}
