

public class Array2DWithNew {

    public static void main(String[] args) {

        int data[][] = new int[2][2];

        data[0][0] = 101;
        data[0][1] = 102;
        data[1][0] = 103;
        data[1][1] = 104;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }

            System.out.println();
        }
    }
}