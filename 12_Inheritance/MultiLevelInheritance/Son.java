class Grandfather
{
    void house()
    {
        System.out.println("Grandfather has a house");
    }
}

class Father extends Grandfather
{
    void car()
    {
        System.out.println("Father has a car");
    }
}

class Son extends Father
{
    void bike()
    {
        System.out.println("Son has a bike");
    }

    public static void main(String st[])
    {
        Son obj = new Son();

        obj.house();
        obj.car();
        obj.bike();
    }
}