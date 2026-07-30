class CircleArea {
    double radius;

    void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea();
        c.radius = 7;

        c.area();
    }
}