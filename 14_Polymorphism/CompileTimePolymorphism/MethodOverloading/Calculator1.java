class Calculator1 {

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        Calculator1 obj = new Calculator1();

        System.out.println(obj.multiply(5, 4));
        System.out.println(obj.multiply(2.5, 4.0));
    }
}