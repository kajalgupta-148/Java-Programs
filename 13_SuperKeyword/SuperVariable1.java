class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println("Child: " + name);
        System.out.println("Parent: " + super.name);
    }
}

public class SuperVariable1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}