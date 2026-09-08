

interface Bird {
    String fly();
}

public class LambdaReturn {
    public static void main(String[] args) {

        Bird obj = () -> {
            return "Parrot is flying";
        };

        System.out.println(obj.fly());
    }
}