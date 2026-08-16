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
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat meows");
    }

    public static void main(String st[])
    {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();

        obj1.eat();
        obj1.bark();

        obj2.eat();
        obj2.meow();
    }
}