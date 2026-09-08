

public class Array2DForEach {

    public static void main(String[] args) {

        int data[][] = {
            {101, 102, 103},
            {104, 105, 106}
        };

        for (int row[] : data) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }
}