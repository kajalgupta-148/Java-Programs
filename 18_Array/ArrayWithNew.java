

public class ArrayWithNew {

    public static void main(String[] args) {

        int data[] = new int[5];

        data[0] = 101;
        data[1] = 102;
        data[2] = 103;
        data[3] = 104;
        data[4] = 105;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}