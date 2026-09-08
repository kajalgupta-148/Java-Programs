

import java.util.Scanner;

public class Array2DInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int data[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print("Enter value: ");
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }

            System.out.println();
        }
    }
}