

interface CheckNumber {
    boolean check(int n);
}

public class LambdaEvenOdd {
    public static void main(String[] args) {

        CheckNumber obj = n -> n % 2 == 0;

        System.out.println("Is 20 even? " + obj.check(20));
    }
}