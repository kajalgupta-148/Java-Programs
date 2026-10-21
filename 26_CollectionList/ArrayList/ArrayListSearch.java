import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> places = new ArrayList<>();

        places.add("Lucknow");
        places.add("Agra");
        places.add("Mathura");
        places.add("Kanpur");

        System.out.print("Enter a place to search: ");
        String place = sc.nextLine();

        if (places.contains(place)) {
            System.out.println("Place found at index: " + places.indexOf(place));
        } else {
            System.out.println("Place not found.");
        }

        sc.close();
    }
}
