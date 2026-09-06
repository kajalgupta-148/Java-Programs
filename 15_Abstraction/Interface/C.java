interface A {

    void show();
}

interface B {

    void display();
}

class C implements A, B {

    public void show() {
        System.out.println("This is show");
    }

    public void display() {
        System.out.println("This is display");
    }

    public static void main(String[] args) {
        C obj = new C();

        obj.show();
        obj.display();
    }
}