class Person
{
    void walk()
    {
        System.out.println("Person can walk");
    }
}

class Student extends Person
{
    void study()
    {
        System.out.println("Student studies");
    }
}

class Teacher extends Person
{
    void teach()
    {
        System.out.println("Teacher teaches students");
    }

    public static void main(String st[])
    {
        Student obj1 = new Student();
        Teacher obj2 = new Teacher();

        obj1.walk();
        obj1.study();

        obj2.walk();
        obj2.teach();
    }
}