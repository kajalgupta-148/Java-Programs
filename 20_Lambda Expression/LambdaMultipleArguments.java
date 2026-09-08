

interface Calculator {
    int add(int a, int b);
}

public class LambdaMultipleArguments {
    public static void main(String[] args) {

        Calculator obj = (a, b) -> a + b;

        System.out.println("Addition = " + obj.add(10, 20));
    }
}