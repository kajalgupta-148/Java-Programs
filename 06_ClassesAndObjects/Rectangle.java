class Rectangle {
    int length;
    int width;

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        r.area();
    }
}