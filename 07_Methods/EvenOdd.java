class EvenOdd {

    void check(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.check(15);
    }
}