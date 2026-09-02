class Person {

    Person(String name) {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    Student() {
        super("Kajal");
        System.out.println("Student constructor");
    }
}

public class SuperConstructor2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}