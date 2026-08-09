class Program3 {

    static int number1;
    static int number2;
    static int sum;
    static int product;

    static {
        number1 = 20;
        number2 = 10;

        sum = number1 + number2;
        product = number1 * number2;

        System.out.println("Static Block Executed");
    }

    static void displayResult() {

        System.out.println("\n----- Calculation -----");
        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);
        System.out.println("Sum      : " + sum);
        System.out.println("Product  : " + product);
    }

    public static void main(String[] args) {

        displayResult();
    }
}