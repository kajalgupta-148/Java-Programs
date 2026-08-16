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

    public static void main(String st[])
    {
        Son obj = new Son();

        obj.house();
        obj.bike();
    }
}