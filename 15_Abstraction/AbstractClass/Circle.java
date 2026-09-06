abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    void area() {
        int r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public static void main(String[] args) {

        Circle obj = new Circle();

        obj.area();
        obj.display();
    }
}