class Animal
{
    void eat()
    {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }

    public static void main(String st[])
    {
        Dog obj = new Dog();

        obj.eat();
        obj.bark();
    }
}