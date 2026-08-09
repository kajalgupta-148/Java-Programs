class Program2 {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }

        return (double) a / b;
    }

    static void displayResults(int a, int b) {

        System.out.println("\n----- Calculator -----");
        System.out.println("First Number  : " + a);
        System.out.println("Second Number : " + b);

        System.out.println("Addition      : " + add(a, b));
        System.out.println("Subtraction   : " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division      : " + divide(a, b));
    }

    public static void main(String[] args) {

        displayResults(20, 10);
    }
}