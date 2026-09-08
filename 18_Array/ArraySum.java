
public class ArraySum {

    public static void main(String[] args) {

        int data[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int value : data) {
            sum = sum + value;
        }

        System.out.println("Sum = " + sum);
    }
}