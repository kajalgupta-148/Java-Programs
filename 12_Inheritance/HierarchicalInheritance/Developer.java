class Employee
{
    void work()
    {
        System.out.println("Employee does work");
    }
}

class Manager extends Employee
{
    void manage()
    {
        System.out.println("Manager manages employees");
    }
}

class Developer extends Employee
{
    void code()
    {
        System.out.println("Developer writes code");
    }

    public static void main(String st[])
    {
        Manager obj1 = new Manager();
        Developer obj2 = new Developer();

        obj1.work();
        obj1.manage();

        obj2.work();
        obj2.code();
    }
}