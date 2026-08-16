class Father
{
    void house()
    {
        System.out.println("Father has a house");
    }
}

class Son extends Father
{
    void bike()
    {
        System.out.println("Son has a bike");
    }
}

class Daughter extends Father
{
    void car()
    {
        System.out.println("Daughter has a car");
    }

    public static void main(String st[])
    {
        Son obj1 = new Son();
        Daughter obj2 = new Daughter();

        obj1.house();
        obj1.bike();

        obj2.house();
        obj2.car();
    }
}