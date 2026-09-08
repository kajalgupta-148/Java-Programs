

interface Bird {
    void color(String name);
}

public class LambdaArgument {
    public static void main(String[] args) {

        Bird obj = (name) -> System.out.println("Bird color is " + name);

        obj.color("Red");
    }
}