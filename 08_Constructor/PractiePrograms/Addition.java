class Addition {

    int num1;
    int num2;

    Addition(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void calculateSum() {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        Addition a1 = new Addition(20, 30);
        a1.calculateSum();
    }
}