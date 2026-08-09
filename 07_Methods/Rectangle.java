class Rectangle {

    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        System.out.println("Area = " + obj.area(8, 5));
    }
}