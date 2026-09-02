class Person {

    void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person {

    @Override
    void display() {
        System.out.println("I am a student");
        super.display();
    }
}

public class SuperMethod2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}