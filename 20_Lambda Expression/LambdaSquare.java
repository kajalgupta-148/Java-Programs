
interface Square {
    int calculate(int n);
}

public class LambdaSquare {
    public static void main(String[] args) {

        Square obj = n -> n * n;

        System.out.println("Square = " + obj.calculate(5));
    }
}