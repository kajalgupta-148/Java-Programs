class College {

    String name = "ABC College";
}

class Student extends College {

    String name = "Rahul";

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("College name: " + super.name);
    }
}

public class SuperVariable3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}