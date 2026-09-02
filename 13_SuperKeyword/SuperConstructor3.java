class Vehicle {

    Vehicle(int speed) {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {

    Car() {
        super(100);
        System.out.println("Car constructor");
    }
}

public class SuperConstructor3 {
    public static void main(String[] args) {
        Car c = new Car();
    }
}