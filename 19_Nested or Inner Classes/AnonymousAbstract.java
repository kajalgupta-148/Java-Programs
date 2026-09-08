abstract class Vehicle {

    abstract void run();
}

public class AnonymousAbstract {

    public static void main(String[] args) {

        Vehicle obj = new Vehicle() {

            @Override
            void run() {
                System.out.println("Car is running.");
            }
        };

        obj.run();
    }
}