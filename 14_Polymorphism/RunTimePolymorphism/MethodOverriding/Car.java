class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {

    void run() {
        System.out.println("Car is running");
    }

    public static void main(String[] args) {

        Vehicle obj = new Car();

        obj.run();
    }
}