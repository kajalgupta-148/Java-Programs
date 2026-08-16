class Vehicle
{
    void start()
    {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle
{
    void ride()
    {
        System.out.println("Bike is riding");
    }

    public static void main(String st[])
    {
        Car obj1 = new Car();
        Bike obj2 = new Bike();

        obj1.start();
        obj1.drive();

        obj2.start();
        obj2.ride();
    }
}