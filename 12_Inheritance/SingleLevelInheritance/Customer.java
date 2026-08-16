class Bank
{
    void account()
    {
        System.out.println("Bank provides account facility");
    }
}

class Customer extends Bank
{
    void deposit()
    {
        System.out.println("Customer deposits money");
    }

    public static void main(String st[])
    {
        Customer obj = new Customer();

        obj.account();
        obj.deposit();
    }
}