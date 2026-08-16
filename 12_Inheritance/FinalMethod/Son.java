class Father
{
    final void bike()
    {
        System.out.println("*** Royal Enfield ***");
    }
}

class Son extends Father
{
    void bike()                     //can't override as method is final,there will show error.
    {
        System.out.println("*** Honda Bike ***");
    }

    public static void main(String st[])
    {
        Son obj = new Son();

        obj.bike();
    }
}