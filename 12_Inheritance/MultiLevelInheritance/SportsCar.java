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

class SportsCar extends Car
{
    void race()
    {
        System.out.println("Sports car is racing");
    }

    public static void main(String st[])
    {
        SportsCar obj = new SportsCar();

        obj.start();
        obj.drive();
        obj.race();
    }
}