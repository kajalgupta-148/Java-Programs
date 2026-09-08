

interface Bird {
    void fly();
}

public class LambdaNoArgument {
    public static void main(String[] args) {

        Bird obj = () -> System.out.println("Bird is flying");

        obj.fly();
    }
}