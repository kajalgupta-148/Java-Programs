public class SmallestInNum {
    public static void main(String[] args) {
        int num = 58396;
        int smallest = 9;

        do {
            int digit = num % 10;
            if (digit < smallest)
                smallest = digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Smallest Digit = " + smallest);
    }
}