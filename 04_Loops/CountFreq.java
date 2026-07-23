public class CountFreq {
    public static void main(String[] args) {
        int num = 1223442;
        int search = 2;
        int count = 0;

        do {
            if (num % 10 == search)
                count++;

            num /= 10;
        } while (num != 0);

        System.out.println("Frequency = " + count);
    }
}