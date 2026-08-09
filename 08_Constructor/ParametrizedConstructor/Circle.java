class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        c1.area();
    }
}