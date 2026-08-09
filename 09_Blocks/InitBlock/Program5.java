class Program5 {

    double length;
    double width;
    double area;
    double perimeter;

    {
        System.out.println("Rectangle Initialization Block Executed");
    }

    Program5(double l, double w) {
        length = l;
        width = w;

        area = length * width;
        perimeter = 2 * (length + width);
    }

    void display() {
        System.out.println("\n----- Rectangle -----");
        System.out.println("Length    : " + length);
        System.out.println("Width     : " + width);
        System.out.println("Area      : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

    public static void main(String[] args) {

        Program5 rectangle1 = new Program5(10, 5);
        Program5 rectangle2 = new Program5(20, 8);

        rectangle1.display();
        rectangle2.display();
    }
}