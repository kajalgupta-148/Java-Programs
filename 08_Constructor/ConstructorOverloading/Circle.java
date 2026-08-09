class Circle {

    Circle() {
        System.out.println("Circle Created");
    }

    Circle(double radius) {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(7);
    }
}