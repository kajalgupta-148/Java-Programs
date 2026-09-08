

public class ArrayAsArgument {

    public static void showArray(int data[]) {

        for (int value : data) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        int data[] = {101, 102, 103, 104, 105};

        showArray(data);
    }
}