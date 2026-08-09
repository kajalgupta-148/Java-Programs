class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Addition = " + obj.add(20, 10));
        System.out.println("Subtraction = " + obj.subtract(20, 10));
        System.out.println("Multiplication = " + obj.multiply(20, 10));
        System.out.println("Division = " + obj.divide(20, 10));
    }
}