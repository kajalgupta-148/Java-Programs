class A {

    A() {
        System.out.println("Default constructor of A");
    }

    A(int x) {
        System.out.println("Parameterized constructor of A: " + x);
    }
}

class B extends A {

    B() {
        super(10);
        System.out.println("Default constructor of B");
    }
}

public class SuperConstructor1 {
    public static void main(String[] args) {

        B b = new B();
    }
}