public class CountEveNodd {
    public static void main(String[] args) {
        int num = 123456;
        int even = 0, odd = 0;

        do {
            int digit = num % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            num /= 10;
        } while (num != 0);

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}