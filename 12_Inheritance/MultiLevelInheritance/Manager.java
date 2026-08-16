class Person
{
    void walk()
    {
        System.out.println("Person can walk");
    }
}

class Employee extends Person
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

    public static void main(String st[])
    {
        Manager obj = new Manager();

        obj.walk();
        obj.work();
        obj.manage();
    }
}