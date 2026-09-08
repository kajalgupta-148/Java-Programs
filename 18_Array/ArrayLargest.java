

public class ArrayLargest {

    public static void main(String[] args) {

        int data[] = {25, 10, 50, 30, 40};

        int largest = data[0];

        for (int value : data) {
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println("Largest = " + largest);
    }
}