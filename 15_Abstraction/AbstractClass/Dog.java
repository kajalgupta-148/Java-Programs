abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
        obj.eat();
    }
}