public class ProdOfDigi {
    public static void main(String[] args) {
        int num = 234;
        int product = 1;

        do {
            product *= num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println("Product = " + product);
    }
}