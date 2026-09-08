import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int data[] = new int[size];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter value: ");
            data[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}