class RectanglArea {

    int length;
    int breadth;

    RectanglArea(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {

        RectanglArea r1 = new RectanglArea(10, 5);
        r1.calculateArea();
    }
}