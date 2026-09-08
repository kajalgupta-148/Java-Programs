

public class TwoDArrayAsArgument {

    public static void showArray(int data[][]) {

        for (int row[] : data) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int data[][] = {
            {101, 102, 103},
            {104, 105, 106}
        };

        showArray(data);
    }
}