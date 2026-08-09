class Rectangle {

    Rectangle() {
        System.out.println("Default Rectangle");
    }

    Rectangle(int length, int breadth) {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
    }
}