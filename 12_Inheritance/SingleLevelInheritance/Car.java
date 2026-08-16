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

    public static void main(String st[])
    {
        Car obj = new Car();

        obj.start();
        obj.drive();
    }
}