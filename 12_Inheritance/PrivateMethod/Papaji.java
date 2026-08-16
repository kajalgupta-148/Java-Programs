class Dadji
{
    private void banglow()    //private function can't be inherited,there will show error.
    {
        System.out.println("*** Shanti Sadan ***");
    }
}

class Papaji extends Dadji
{
    public static void main(String st[])
    {
        Papaji obj = new Papaji();

        obj.banglow();
    }
}