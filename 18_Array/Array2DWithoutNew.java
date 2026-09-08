

public class Array2DWithoutNew {

    public static void main(String[] args) {

        int data[][] = {
            {101, 102, 103},
            {104, 105, 106},
            {107, 108, 109}
        };

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }

            System.out.println();
        }
    }
}